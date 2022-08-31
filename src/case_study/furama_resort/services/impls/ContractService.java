package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Contract;
import case_study.furama_resort.services.IContractService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadContractFile;
import case_study.furama_resort.utils.read_and_write.WriteContractFile;

import java.util.*;

public class ContractService implements IContractService {
    private static final Scanner scanner = new Scanner(System.in);
    private static Set<Contract> contractList;
    private final ReadContractFile readContractFile = new ReadContractFile();
    private final WriteContractFile writeContractFile = new WriteContractFile();

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
        Booking booking = BookingService.getBookingQueue().remove();
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
