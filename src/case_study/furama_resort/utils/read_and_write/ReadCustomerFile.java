package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Employee;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReadCustomerFile {
    public List<Customer> readCustomerFile(String path) {
        List<String> stringList = ReadFileUtil.readFile(path);
        List<Customer> customerList = new LinkedList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            customerList.add(new Customer(
                    info[0],
                    info[1],
                    info[2],
                    info[3],
                    info[4],
                    info[5],
                    info[6],
                    info[7],
                    info[8]));
        }
        return customerList;
    }
}
