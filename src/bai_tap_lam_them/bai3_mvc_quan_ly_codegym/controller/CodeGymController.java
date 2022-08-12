package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.controller;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl.StudentService;

import java.util.Scanner;

public class CodeGymController {
    private Scanner scanner = new Scanner(System.in);
    private StudentController studentController = new StudentController();
    public static boolean continueRunning;

    public void menuManagement() {
        continueRunning = true;
        while (continueRunning) {
            System.out.println("-------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym");
            System.out.println("1. Quản lý Sinh viên");
            System.out.println("2. Quản lý Giáo viên");
            System.out.println("3. Exit");
            System.out.print("Mời bạn chọn tính năng 1->3 : ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    studentController.studentManage();
                    break;
                case 2:
//                    TeacherController.teacherManage();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }

        }
    }


}
