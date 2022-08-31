package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Contract;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.Queue;
import java.util.Set;

public class WriteContractFile {
    public void writeContractFile(Set<Contract> contractList) {
        final String CONTRACT_PATH = "src\\case_study\\furama_resort\\data\\contract.csv";
        StringBuilder data = new StringBuilder("BookingId, CustomerId, StartDate, EndDate, ServiceName,ServiceType, ContractId, TotalCost, Deposits\n");

        for (Contract contract : contractList) {
            data.append(contract.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(CONTRACT_PATH, data.toString());
    }
}
