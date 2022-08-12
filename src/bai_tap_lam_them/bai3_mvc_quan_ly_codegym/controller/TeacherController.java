package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.controller;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);
    public static void teacherManage() {
        System.out.println("---------------------------------");
        System.out.println("Chào mừng bạn đến với CodeGym - Teacher:");
        System.out.println("1. Hiển thị danh sách giáo viên");
        System.out.println("2. Thêm mới giáo viên");
        System.out.println("3. Cập nhật thông tin giáo viên");
        System.out.println("4. Xóa giáo viên");
        System.out.println("5. Exit");
        System.out.print("Mời bạn nhập chức năng 1->5: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
//                                        studentService.displayAllStudent();
                break;
            case 2:
//                                        studentService.addStudent();
                break;
            case 3:
                break;
            case 4:
//                                        studentService.removeStudent();
                break;
            case 5:
                return;
            default:
                System.out.println("Lựa chọn bạn nhập không đúng!");
        }
}}
