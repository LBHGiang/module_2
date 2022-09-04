package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Contract;
import case_study.furama_resort.services.IContractService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadContractFile;
import case_study.furama_resort.utils.read_and_write.ReadUnsignedFile;
import case_study.furama_resort.utils.read_and_write.WriteContractFile;
import case_study.furama_resort.utils.read_and_write.WriteUnsignedFile;

import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class ContractService implements IContractService {
    private static final Scanner scanner = new Scanner(System.in);
    private static Set<Contract> contractList;
    private final ReadContractFile readContractFile = new ReadContractFile();
    private final ReadUnsignedFile readUnsignedFile = new ReadUnsignedFile();
    private final WriteContractFile writeContractFile = new WriteContractFile();
    private final WriteUnsignedFile writeUnsignedFile = new WriteUnsignedFile();

    @Override
    public void displayList() {
        contractList = readContractFile.readContractFile();
        if (contractList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("----------Contract List----------");
        for (Contract contract : contractList
        ) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void addNewObject() {
        Queue<Booking> bookingQueue = readUnsignedFile.readUnsignedFile();
        if (bookingQueue.isEmpty()) {
            System.out.println("Villas and Houses have no booking yet");
            return;
        }
        Booking booking = bookingQueue.remove();
        contractList = readContractFile.readContractFile();
        System.out.println("Please enter the following information:");
        String contractId = getContractId(contractList);
        double totalCost = GetInFo.getDoubleNumber("Total Cost: ", 0, 999999999);
        double deposits = GetInFo.getDoubleNumber("Deposits : ", 0, totalCost);

        contractList.add(new Contract(
                booking.getBookingId(),
                booking.getCustomerId(),
                booking.getStartDate(),
                booking.getEndDate(),
                booking.getServiceName(),
                booking.getServiceType(),
                contractId,
                totalCost,
                deposits));
        System.out.println("Added new contract successfully!");
        writeContractFile.writeContractFile(contractList);
        writeUnsignedFile.writeUnsignedFile(bookingQueue);
        displayList();
    }

    public String getContractId(Set<Contract> contractSet) {
        while (true) {
            String id = GetInFo.getStringInfo("Contract Id: ");
            try {
                for (Contract contract : contractSet
                ) {
                    if (contract.getContractId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


}
