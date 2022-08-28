package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Employee;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.List;

public class WriteEmployeeFile {
    public void writeEmployeeFile(String path, List<Employee> employeeList) {
        StringBuilder data = new StringBuilder("Id,Name,Date Of Birth,Gender, IdentityCard, PhoneNumber, Email, Level, Position, Salary\n");

        for (Employee employee : employeeList) {
            data.append(employee.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(path, data.toString());
    }
}
