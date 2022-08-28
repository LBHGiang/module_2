package case_study.furama_resort.services.utils.read_and_write;

import case_study.furama_resort.models.Employee;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.util.ArrayList;
import java.util.List;

public class ReadEmployeeFile {
    public List<Employee> readEmployeeFile(String path) {
        List<String> stringList = ReadFileUtil.readFile(path);
        List<Employee> employeeList = new ArrayList<>();

        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            employeeList.add(new Employee(
                    info[0],
                    info[1],
                    info[2],
                    info[3],
                    info[4],
                    info[5],
                    info[6],
                    info[7],
                    info[8],
                    Double.parseDouble(info[9])));
        }
        return employeeList;
    }
}
