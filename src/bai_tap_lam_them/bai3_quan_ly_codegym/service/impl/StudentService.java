package bai_tap_lam_them.bai3_quan_ly_codegym.service.impl;

import bai_tap_lam_them.bai3_quan_ly_codegym.model.SortByNameComparator;
import bai_tap_lam_them.bai3_quan_ly_codegym.model.SortByScoreComparator;
import bai_tap_lam_them.bai3_quan_ly_codegym.model.Student;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.IStudentService;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public Scanner scanner = new Scanner(System.in);
    private static final String PATH = "src\\bai_tap_lam_them\\bai3_quan_ly_codegym\\data\\student.csv";
    ReadStudentFile readStudentFile = new ReadStudentFile();
    WriteStudentFile writeStudentFile = new WriteStudentFile();

    private static List<Student> studentList;

    @Override
    public void displayAllStudent() {
        System.out.println("----------Danh sách sinh viên------------");
        studentList = readStudentFile.readStudentFile(PATH);

        if (studentList.size() == 0) {
            System.out.println("Danh sách rỗng");
        }
        for (Student student : studentList
        ) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void addNewStudent() {
        studentList = readStudentFile.readStudentFile(PATH);
        System.out.println("Mời bạn nhập thông tin cho học sinh: ");

        studentList.add(new Student(
                getAndCheckId(),
                CommonService.getNameInfo(),
                CommonService.getDateInfo(18, 100),
                CommonService.getGenderInfo(),
                getScore(),
                getClassName()));
        System.out.println("Thêm mới học sinh thành công!");
        writeStudentFile.writeStudentFile(PATH, studentList);
        displayAllStudent();
    }

    @Override
    public void editStudent() {
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

    @Override
    public void removeStudent() {
        studentList = readStudentFile.readStudentFile(PATH);
        Student student = findStudentByIdToTask("xóa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        System.out.println("Bạn có chắc chắn xóa sinh viên này không?");
        System.out.println(student.toString());
        System.out.println("1- Có -----------2 hoặc Khác- Không");
        String choose = scanner.nextLine();
        if (choose.equals("1")) {
            studentList.remove(student);
            System.out.println("Xóa sinh viên thành công");
            writeStudentFile.writeStudentFile(PATH, studentList);
        } else {
            System.out.println("Xóa sinh viên không thành công");
        }
    }

    @Override
    public void findStudentByID() {
        studentList = readStudentFile.readStudentFile(PATH);
        String id = CommonService.getIdInfo();
        for (Student student :
                studentList) {
            if (student.getId().equals(id)) {
                System.out.println("Kết quả tìm kiếm: ");
                System.out.println(student.toString());
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên nào có id là " + id + "!");
    }

    @Override
    public void findStudentByName() {
        studentList = readStudentFile.readStudentFile(PATH);
        List<Student> foundStudent = new ArrayList<>();
        System.out.println("Vui lòng nhập tên của Học sinh cần tìm kiếm!");
        String name = scanner.nextLine();
        for (Student student :
                studentList) {
            if (student.getName().contains(name)) {
                foundStudent.add(student);
            }
        }
        if (foundStudent.isEmpty()) {
            System.out.println("Không tìm thấy học sinh nào!");
        } else {
            System.out.println("Kết quả tìm kiếm:");
            for (Student student :
                    foundStudent) {
                System.out.println(student.toString());
            }
        }
    }

    @Override
    public void sortStudentByScore() {
        studentList = readStudentFile.readStudentFile(PATH);
        studentList.sort(new SortByScoreComparator());
        System.out.println("Sắp xếp thành công");
        writeStudentFile.writeStudentFile(PATH, studentList);
        displayAllStudent();
    }

    @Override
    public void sortStudentByName() {
        studentList = readStudentFile.readStudentFile(PATH);
        studentList.sort(new SortByNameComparator());
        System.out.println("Sắp xếp thành công");
        writeStudentFile.writeStudentFile(PATH, studentList);
        displayAllStudent();

    }

    @Override
    public void sortStudentByHand() {
        studentList = readStudentFile.readStudentFile(PATH);
        for (int i = 1; i < studentList.size(); i++) {

            Student temp = studentList.get(i);
            int j;
            for (j = i - 1; j >= 0 && studentList.get(j).getName().compareTo(temp.getName()) > 0; j--) {
                studentList.set(j + 1, studentList.get(j));
            }
            studentList.set(j + 1, temp);
        }
        writeStudentFile.writeStudentFile(PATH, studentList);
        System.out.println("Sắp xếp thành công");
        displayAllStudent();
    }

    /**
     * Hàm lấy ngày sinh từ người dùng.
     * Yêu cầu người dùng nhập đúng định dạng dd/MM/yyyy chặt chẽ.
     *
     * @param ageFrom Tuổi nhỏ nhất (18)
     * @param ageTo   Tuổi lớn nhất (100)
     * @return ngày sinh (String)
     */
    public String getDateOfBirthInFo(int ageFrom, int ageTo) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Scanner scanner = new Scanner(System.in);
        String dateOfBirth;
        Date checkFormat;
        Date now;
        String strNow;
        int yearNow;
        int yearOfBirth;
        int age;
        while (true) {
            try {
                System.out.print("Vui lòng nhập ngày sinh: ");
                dateOfBirth = scanner.nextLine();
                checkFormat = sdf.parse(dateOfBirth);//check dữ liệu nhập vào
                now = new Date();//Thời gian hiện tại
                strNow = sdf.format(now);//format thành chuỗi dạng  dd/MM/yyyy

                //lấy năm hiện tại
                yearNow = Integer.parseInt(strNow.substring(strNow.length() - 4));

                //lấy năm sinh
                yearOfBirth = Integer.parseInt(dateOfBirth.substring(dateOfBirth.length() - 4));

                age = yearNow - yearOfBirth; //tính tuổi đến hiện tại

                //Kiểm tra tuổi nhập vào
                if (age < ageFrom || age > ageTo) {
                    throw new InvalidNumberException("Tuổi phải lớn hơn hoặc bằng 18 và nhỏ hơn hoặc bằng 100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ngày sinh phải là chuỗi số có định dạng dd/MM/yyyy. Nhập lại: ");
            } catch (ParseException e) {
                System.out.println("Dữ liệu nhập vào chưa chính xác. Nhập lại: ");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
        return dateOfBirth;
    }

    /**
     * Cho người dùng nhập ID đúng định dạng (gọi hàm)
     * Sau đó check sự tồn tại
     *
     * @return id String
     */
    private String getAndCheckId() {
        while (true) {
            String id = CommonService.getIdInfo();
            try {
                for (Student student : studentList
                ) {
                    if (student.getId().equals(id)) {
                        throw new IdExistedException("Id đã tồn tại! Vui lòng nhập lại.");
                    }
                }
                return id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public double getScore() {
        double score;
        while (true)
            try {
                System.out.print("Score: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 10) {
                    throw new InvalidNumberException("Điểm nhập vào không hợp lệ: Điểm > 0 và Điểm <= 10");
                }
                return score;
            } catch (NumberFormatException e) {
                System.out.println("Điểm phải là số thực! Vui lòng nhập lại!");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy tên lớp với định dạng
     * (A|C)XXXX(G|I)1 : với X là các số từ 0 -> 9
     *
     * @return className
     */
    private String getClassName() {
        String className;
        final String CLASS_NAME_REGEX = "^[AC]\\d{4}[GI]1$";
        while (true)
            try {
                System.out.print("ClassName: ");
                className = scanner.nextLine();
                if (!className.matches(CLASS_NAME_REGEX)) {
                    throw new InvalidFormatException("Tên lớp chưa đúng định dạng! " +
                            "Vui lòng nhập lại! Ví dụ C0622G1");
                }
                return className;
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            }
    }

    public Student findStudentByIdToTask(String taskName) {
        System.out.println("Vui lòng nhập id của Học Sinh cần " + taskName + "!");
        String id = CommonService.getIdInfo();
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

}
