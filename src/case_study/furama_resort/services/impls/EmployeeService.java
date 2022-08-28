package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.model.Student;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.impl.CommonService;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Employee;
import case_study.furama_resort.models.Person;
import case_study.furama_resort.services.IEmployeeService;
import case_study.furama_resort.services.utils.get_info.GetInFo;
import case_study.furama_resort.services.utils.my_date.MyDate;
import case_study.furama_resort.services.utils.read_and_write.ReadEmployeeFile;
import case_study.furama_resort.services.utils.read_and_write.WriteEmployeeFile;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    public Scanner scanner = new Scanner(System.in);
    private static final String EMPLOYEE_PATH = "src\\case_study\\furama_resort\\data\\employee.csv";
    ReadEmployeeFile readEmployeeFile = new ReadEmployeeFile();
    WriteEmployeeFile writeEmployeeFile = new WriteEmployeeFile();


    public static final String ID_REGEX = "^\\S+$";
    public static final String IDENTITY_CARD_REGEX = "^[1-9][0-9]{8}";
    public static final String PHONE_NUMBER_REGEX = "\\d{2}[-]0\\d{9}";
    public static final String EMAIL_REGEX = "[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";


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
                getNameInfo(),
                getBirthdayInfo(),
                getGenderInfo(),
                getIdentityCardInfo(),
                getPhoneNumberInfo(),
                getEmailInfo(),
                getLevelInfo(),
                getPositionInfo(),
                getSalaryInfo());



        System.out.println("Thêm mới học sinh thành công!");
        writeStudentFile.writeStudentFile(PATH, studentList);
        displayAllStudent();
    }

    private double getSalaryInfo() {

    }

    private String getPositionInfo() {
        int choice = GetInFo.takeChoice("Level: ", Employee.POSITION_OPTIONS);
        return Employee.POSITION_OPTIONS[choice];
    }

    private String getLevelInfo() {
        int choice = GetInFo.takeChoice("Level: ", Employee.LEVEL_OPTIONS);
        return Employee.LEVEL_OPTIONS[choice];

    }

    private String getEmailInfo() {
        return GetInFo.getStringInfo("Email: ", EMAIL_REGEX,
                "Name: character or number +@+ Tail: character or number or 1 sign.\n" +
                        "Sign . not at the end.");
    }

    private String getPhoneNumberInfo() {
        return GetInFo.getStringInfo("Phone Number: ", PHONE_NUMBER_REGEX,
                "Phone number format must be: xx-0xxxxxxxxx");
    }

    private String getIdentityCardInfo() {
        return GetInFo.getStringInfo("IdentityCard: ", IDENTITY_CARD_REGEX, "Identity Card number must be consists of 9 numbers, the first number is different from 0");
    }

    private String getGenderInfo() {
       int choice = GetInFo.takeChoice("Gender: ", Person.GENDER_OPTIONS);
       return Person.GENDER_OPTIONS[choice];
    }

    private String getBirthdayInfo() {
       return GetInFo.getDateInfo("Date Of Birth: ", 18, 100).getStrDate();
    }


    @Override
    public void editInfo() {
        studentList = readStudentFile.readStudentFile(PATH);

        Student student = findStudentByIdToTask("chỉnh sửa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }

        System.out.println("------------------------------------");
        System.out.println("Sinh viên cần chỉnh sửa:");
        System.out.println(student.toString());
        String choose;
        do {
            System.out.println("Bạn muốn chỉnh sửa nội dung nào?");
            System.out.println("1. ID");
            System.out.println("2. Tên học sinh");
            System.out.println("3. Ngày sinh");
            System.out.println("4. Giới tính");
            System.out.println("5. Điểm số");
            System.out.println("6. Tên lớp");
            System.out.println("7. Thoát");
            System.out.println("Chọn nội dung cần chỉnh sửa: 1 -> 7");
            choose = scanner.nextLine();

            switch (choose) {
                case "1":
                    student.setId(getAndCheckId());
                    break;
                case "2":
                    student.setName(CommonService.getNameInfo());
                    break;
                case "3":
                    student.setDateOfBirth(CommonService.getDateInfo(18, 100));
                    break;
                case "4":
                    student.setGender(CommonService.getGenderInfo());
                    break;
                case "5":
                    student.setScore(getScore());
                    break;
                case "6":
                    student.setClassName(getClassName());
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Nội dung bạn vừa chọn không có trong menu");
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            System.out.println(student.toString());
            writeStudentFile.writeStudentFile(PATH, studentList);
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Tiếp tục ------------- 2 hoặc Khác- Hoàn tất, quay trở lại.");
            choose = scanner.nextLine();
            if (!choose.equals("1")) {
                System.out.println("Quay lại menu");
                return;
            }
        } while (true);
    }

    /**
     * Nhập và kiểm tra ID
     * Định dạng ID: Không chứa khoảng trắng
     *
     * @return
     */
    private String getAndCheckId(List<Employee> list) {
        while (true) {
            String id = GetInFo.getStringInfo(
                    "ID: ",
                    ID_REGEX
                    , "Id must not contain spaces");
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

    public String getNameInfo() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";
        return GetInFo.getStringInfo("Name: ", NAME_REGEX,
                "The name cannot contain numbers and special characters.",
                5, 10,
                "Length of name must be from 5 to 50 characters long");
    }
}
