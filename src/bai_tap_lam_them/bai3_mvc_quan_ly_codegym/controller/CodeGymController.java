package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.controller;

import java.io.IOException;
import java.util.Scanner;

public class CodeGymController {
    private final Scanner scanner = new Scanner(System.in);
    private final StudentController studentController = new StudentController();
    private final TeacherController teacherController = new TeacherController();

    public void menuManagement() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym");
            System.out.println("1. Quản lý Sinh viên");
            System.out.println("2. Quản lý Giáo viên");
            System.out.println("3. Exit");
            System.out.print("Mời bạn chọn tính năng 1->3 : ");
            String choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    studentController.studentManage();
                    break;
                case "2":
                    teacherController.teacherManage();
                    break;
                case "3":
                    System.out.println("Cám ơn bạn đã sử dụng dịch vụ của chúng tôi.");
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }


}
