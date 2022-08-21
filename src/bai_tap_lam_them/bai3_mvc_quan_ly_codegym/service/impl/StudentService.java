package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.SortByNameComparator;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.SortByScoreComparator;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.IStudentService;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils.IdExistedException;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils.InvalidNumberException;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils.InvalidStringException;

import java.util.*;

public class StudentService implements IStudentService {
    public Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student("1", "Giang", "03/03/19", "Nam", 9, "C05"));
        studentList.add(new Student("2", "Gia", "02/02/19", "Nam", 7, "C06"));
        studentList.add(new Student("3", "Gian", "03/03/13", "Nữ", 8, "C06"));
    }


    @Override
    public void displayAllStudent() {
        System.out.println("----------Danh sách sinh viên------------");
        for (Student student : studentList
        ) {
            System.out.println(student.toString());
        }
    }

    @Override
    public void addStudent() {
        studentList.add(getInfoStudent());
        System.out.println("Thêm mới học sinh thành công!");
    }

    @Override
    public void editStudent() {
        Student student = findStudentByIdToTask("chỉnh sửa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        String choose;
        do {
            System.out.println("---------------------------------------------");
            System.out.println("Sinh viên cần chỉnh sửa:");
            System.out.println(student.toString());
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
                    student.setId(getID());
                    break;
                case "2":
                    student.setName(getInfo("tên"));
                    break;
                case "3":
                    student.setDateOfBirth(getInfo("ngày sinh"));
                    break;
                case "4":
                    student.setGender(getInfo("giới tính"));
                    break;
                case "5":
                    student.setScore(Integer.parseInt(getInfo("điểm")));
                    break;
                case "6":
                    student.setClassName(getInfo("tên lớp"));
                    break;
                case "7":
                    return;
                default:
                    System.out.println("Nội dung bạn vừa chọn không có trong menu");
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Có ------------- 2- Hoàn tất, quay trở lại.");
            choose = scanner.nextLine();
            if (!choose.equals("1")) {
                return;
            }
        } while (true);
    }

    @Override
    public void removeStudent() {
        Student student = findStudentByIdToTask("xóa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        System.out.println("Bạn có chắc chắn xóa sinh viên này không?");
        System.out.println(student.toString());
        System.out.println("1- Có -----------2- Không");
        String choose = scanner.nextLine();
        if (choose.equals("1")) {
            studentList.remove(student);
            System.out.println("Xóa sinh viên thành công");
        } else {
            System.out.println("Xóa sinh viên không thành công");
        }
    }

    @Override
    public void findStudentByID() {
        String id = getInfo("ID");
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
        List<Student> foundStudent = new ArrayList<>();
        String name = getInfo("Tên");
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
        studentList.sort(new SortByScoreComparator());
        displayAllStudent();
    }

    @Override
    public void sortStudentByName() {
        studentList.sort(new SortByNameComparator());
        displayAllStudent();
    }

    @Override
    public void sortStudentByHand() {

        for (int i = 1; i < studentList.size(); i++) {

            Student temp = studentList.get(i);
            int j;
            for (j = i - 1; j >= 0 && studentList.get(j).getName().compareTo(temp.getName()) > 0; j--) {
                studentList.set(j + 1, studentList.get(j));
            }
            studentList.set(j + 1, temp);
        }
        displayAllStudent();
    }

    public Student getInfoStudent() {
        System.out.println("Vui lòng nhập thông tin cho sinh viên: ");
        String id = getID();
        String name = getInfo("Tên");
        String dateOfBirth = getInfo("Ngày sinh");
        String gender = getInfo("Giới tính");
        double score = getScore();
        String className = getInfo("Tên lớp");

        return new Student(id, name, dateOfBirth, gender, score, className);
    }

    private void checkExistID(String id) throws IdExistedException {
        for (Student student : studentList
        ) {
            if (student.getId().equals(id)) {
                throw new IdExistedException("Id đã tồn tại! Vui lòng nhập lại.");
            }
        }
    }

    public double getScore(){
        double score;
        while (true)
            try {
                score = Double.parseDouble(getInfo("Score"));
                checkInvalidScore(score);
                break;
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            } catch (NumberFormatException e){
                System.out.println("Điểm phải là số thực! Vui lòng nhập lại!");
            }
        return score;
    }

    public String getID() {
        String id;
        while (true)
            try {
                id = getInfo("ID");
                checkExistID(id);
                break;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        return id;
    }

    public String getInfo(String infoName) {
        String input;
        while (true) {
            try {
                System.out.print("Vui lòng nhập " + infoName + ": ");
                input = scanner.nextLine();
                checkInvalidString(input);
                break;
            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        }

        return input;
    }

    public Student findStudentByIdToTask(String taskName) {
        String id = getInfo("ID để "+taskName);
        for (Student student : studentList) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    public void checkInvalidScore(double score) throws InvalidNumberException {
        if (score < 0 || score > 10) {
            throw new InvalidNumberException("Điểm nhập vào không hợp lệ: Điểm > 0 và Điểm <= 10");
        }
    }

    public void checkInvalidString(String str) throws InvalidStringException {
        if (str.equals("")) {
            throw new InvalidStringException("Vui lòng nhập dữ liệu vào!");
        }
    }

}
