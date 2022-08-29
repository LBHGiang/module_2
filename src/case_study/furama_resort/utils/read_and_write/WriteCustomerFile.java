package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Customer;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.List;

public class WriteCustomerFile {
    public void writeCustomerFile(String path, List<Customer> customerList) {
        StringBuilder data = new StringBuilder("Id,Name,Date Of Birth,Gender, IdentityCard, PhoneNumber, Email, CustomerType, Address\n");

        for (Customer customer : customerList) {
            data.append(customer.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(path, data.toString());
    }
}
