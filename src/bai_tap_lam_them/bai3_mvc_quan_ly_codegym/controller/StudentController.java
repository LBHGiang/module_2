package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.controller;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.IStudentService;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl.StudentService;

import java.util.Scanner;

public class StudentController {
    private Scanner scanner = new Scanner(System.in);
    private IStudentService studentService = new StudentService();
    private static int choice;

    public void studentManage() {
        while (true) {
            System.out.println("---------------------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Student");
            System.out.println("1. Hiển thị danh sách học viên");
            System.out.println("2. Thêm mới học sinh");
            System.out.println("3. Cập nhật thông tin học sinh");
            System.out.println("4. Xóa học sinh");
            System.out.println("5. Tìm kiếm học sinh");
            System.out.println("6. Trở lại CodeGym menu");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->6: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    studentService.displayAllStudent();
                    break;
                case 2:
                    studentService.addStudent();
                    break;
                case 3:
                    studentService.editStudent();
                    break;
                case 4:
                    studentService.removeStudent();
                    break;
                case 5:
                    findStudent();
                    break;
                case 6:
                    return;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }

    private void findStudent() {
        System.out.println("----------------------------");
        System.out.println("Vui lòng chọn cách tìm kiếm:");
        System.out.println("1. Tìm theo ID----- 2. Tìm theo tên");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1: studentService.findStudentByID();
            case 2: studentService.findStudentByName();
            default:
                System.out.println("Lựa chọn bạn nhập không đúng!");
        }
    }


}
