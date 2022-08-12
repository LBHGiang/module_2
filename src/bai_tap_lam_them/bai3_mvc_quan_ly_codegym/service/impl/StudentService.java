package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.IStudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    public static Scanner scanner = new Scanner(System.in);
    private static List<Student> studentList = new ArrayList<>();

    static {
        studentList.add(new Student(1, "Giang", "03/03/19", "Nam", 9, "C05"));
        studentList.add(new Student(2, "Hải", "02/02/19", "Nam", 8, "C06"));
        studentList.add(new Student(3, "Nam", "03/03/13", "Nữ", 8, "C06"));
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
        studentList.add(getInforStudent());
        System.out.println("Thêm mới học sinh thành công!");
    }

    @Override
    public void editStudent() {
        Student student = searchStudentByID("chỉnh sửa");
        int choose;
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
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    student.setId(Integer.parseInt(getEditInfor("ID")));
                    break;
                case 2:
                    student.setName(getEditInfor("tên"));
                    break;
                case 3:
                    student.setDateOfBirth(getEditInfor("ngày sinh"));
                    break;
                case 4:
                    student.setGender(getEditInfor("giới tính"));
                    break;
                case 5:
                    student.setScore(Integer.parseInt(getEditInfor("điểm")));
                    break;
                case 6:
                    student.setClassName(getEditInfor("tên lớp"));
                    break;
                case 7:
                    return;
            }
            System.out.println("Chỉnh sửa thành công!");
            System.out.println("Bạn có muốn tiếp tục chỉnh sửa?");
            System.out.println("1- Có ------------- 2- Hoàn tất");
            choose = Integer.parseInt(scanner.nextLine());
            if(choose != 1) {return;}
        } while (true);
    }

    @Override
    public void removeStudent() {
        Student student = searchStudentByID("xóa");
        if (student == null) {
            System.out.println("ID không tồn tại trong danh sách!");
            return;
        }
        System.out.println("Bạn có chắc chắn xóa sinh viên này không?");
        System.out.println(student.toString());
        System.out.println("1- Có -----------2- Không");
        int choose = Integer.parseInt(scanner.nextLine());
        if (choose == 1) {
            studentList.remove(student);
            System.out.println("Xóa sinh viên thành công");
        } else {
            System.out.println("Xóa sinh viên không thành công");
        }
    }



    public Student getInforStudent() {
        System.out.println("Vui lòng nhập thông tin cho sinh viên: ");
        System.out.print("ID = ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên = ");
        String name = scanner.nextLine();
        System.out.print("Ngày sinh = ");
        String dateOfBirth = scanner.nextLine();
        System.out.print("Giới tính = ");
        String gender = scanner.nextLine();
        System.out.print("Điểm số = ");
        int score = Integer.parseInt(scanner.nextLine());
        System.out.print("Tên lớp = ");
        String className = scanner.nextLine();

        return new Student(id, name, dateOfBirth, gender, score, className);
    }

    public String getEditInfor(String editContent){
        System.out.print("Vui lòng nhập "+ editContent+ " mới: ");
        return scanner.nextLine();
    }

    public Student searchStudentByID(String taskName) {
        System.out.printf("Vui lòng nhập ID của Học sinh cần %s: ", taskName);
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                return studentList.get(i);
            }
        }
        return null;
    }
}
