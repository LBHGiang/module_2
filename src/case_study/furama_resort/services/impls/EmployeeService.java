package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Employee;
import case_study.furama_resort.services.IEmployeeService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadEmployeeFile;
import case_study.furama_resort.utils.read_and_write.WriteEmployeeFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String EMPLOYEE_PATH = "src\\case_study\\furama_resort\\data\\employee.csv";
    private static final ReadEmployeeFile readEmployeeFile = new ReadEmployeeFile();
    private static final WriteEmployeeFile writeEmployeeFile = new WriteEmployeeFile();

    private static List<Employee> employeeList;

    @Override
    public void displayList() {
        employeeList = readEmployeeFile.readEmployeeFile(EMPLOYEE_PATH);
        if (employeeList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("----------Employee List----------");
        for (Employee employee : employeeList
        ) {
            System.out.println(employee.toString());
        }
    }

    @Override
    public void addNewObject() {
        employeeList = readEmployeeFile.readEmployeeFile(EMPLOYEE_PATH);
        System.out.println("Please enter the following information:");

        employeeList.add(new Employee(
                getAndCheckId(employeeList),
                GetInFo.getNameInfo(),
                getBirthdayInfo(),
                GetInFo.getGenderInfo(),
                getAndCheckIdentityCard(employeeList),
                GetInFo.getPhoneNumberInfo(),
                GetInFo.getEmailInfo(),
                getLevelInfo(),
                getPositionInfo(),
                getSalaryInfo()));

        System.out.println("Added new employee successfully!");
        writeEmployeeFile.writeEmployeeFile(EMPLOYEE_PATH, employeeList);
        displayList();
    }

    @Override
    public void editInfo() {
        employeeList = readEmployeeFile.readEmployeeFile(EMPLOYEE_PATH);

        if (employeeList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        Employee employee = findEmployeeById(employeeList);
        if (employee == null) {
            System.out.println("Id does not exist in the list!");
            return;
        }

        System.out.println("------------------------------------");
        System.out.println("Employee need to edit information:");
        System.out.println(employee.toString());
        do {
            String[] editOptions = {"Id", "Name", "DateOfBirth", "Gender", "IdentityCard",
                    "PhoneNumber", "Email", "Level", "Osition", "Salary", "Return"};
            int choose = GetInFo.takeChoice("Select the content to edit: ", editOptions);
            switch (choose) {
                case 1:
                    employee.setId(getAndCheckId(employeeList));
                    break;
                case 2:
                    employee.setName(GetInFo.getNameInfo());
                    break;
                case 3:
                    employee.setDateOfBirth(getBirthdayInfo());
                    break;
                case 4:
                    employee.setGender(GetInFo.getGenderInfo());
                    break;
                case 5:
                    employee.setIdentityCard(getAndCheckIdentityCard(employeeList));
                    break;
                case 6:
                    employee.setPhoneNumber(GetInFo.getPhoneNumberInfo());
                    break;
                case 7:
                    employee.setEmail(GetInFo.getEmailInfo());
                    break;
                case 8:
                    employee.setLevel(getLevelInfo());
                    break;
                case 9:
                    employee.setPosition(getPositionInfo());
                    break;
                case 10:
                    employee.setSalary(getSalaryInfo());
                    break;
                case 11:
                    return;
                default:
                    System.out.println("Your choice is not correct!");
                    return;
            }
            System.out.println("Editing is successful!");
            System.out.println(employee.toString());
            writeEmployeeFile.writeEmployeeFile(EMPLOYEE_PATH, employeeList);

            System.out.println("Do you want to continue editing?");
            System.out.printf("%-10sContinue\n%-10sCompleted", 1, "Other");
            String accept = scanner.nextLine();
            if (!accept.equals("1")) {
                System.out.println("Return");
                return;
            }
        } while (true);
    }

    private Employee findEmployeeById(List<Employee> list) {
        final String ID_REGEX = "^\\S+$";
        String id = GetInFo.getStringInfo("Please enter Employee ID: ", ID_REGEX, "Id must not contain spaces");
        for (Employee employee : list
        ) {
            if (employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    /**
     * Nhập và kiểm tra ID
     * Định dạng ID: Không chứa khoảng trắng
     *
     * @return
     */
    private String getAndCheckId(List<Employee> list) {
        final String ID_REGEX = "^\\S+$";
        while (true) {
            String id = GetInFo.getStringInfo("ID: ", ID_REGEX, "Id must not contain spaces");
            try {
                for (Employee employee : list
                ) {
                    if (employee.getId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private double getSalaryInfo() {
        return GetInFo.getDoubleNumber("Salary: ", 0, 999999999);
    }

    private String getPositionInfo() {
        int choice = GetInFo.takeChoice("Level: ", Employee.POSITION_OPTIONS);
        return Employee.POSITION_OPTIONS[choice - 1];
    }

    private String getLevelInfo() {
        int choice = GetInFo.takeChoice("Level: ", Employee.LEVEL_OPTIONS);
        return Employee.LEVEL_OPTIONS[choice - 1];

    }

    private String getAndCheckIdentityCard(List<Employee> list) {
        while (true) {
            String identityCard = GetInFo.getIdentityCardInfo();
            try {
                for (Employee employee : list
                ) {
                    if (employee.getIdentityCard().equals(identityCard)) {
                        throw new IdExistedException("IdentityCard already exists! Please re-enter!");
                    }
                }
                return identityCard;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String getBirthdayInfo() {
        return GetInFo.getDateInfo("Date Of Birth: ", 18, 100).getStrDate();
    }


}
