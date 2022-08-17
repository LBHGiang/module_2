package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.controller;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.ITeacherService;
import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.impl.TeacherService;
import com.sun.org.apache.bcel.internal.classfile.Code;

import java.util.Scanner;

public class TeacherController {
    public static Scanner scanner = new Scanner(System.in);
    public static ITeacherService iTeacherService = new TeacherService();
    private static int choose;

    public static void teacherManage() {
        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Chào mừng bạn đến với CodeGym - Teacher:");
            System.out.println("1. Hiển thị danh sách giáo viên");
            System.out.println("2. Thêm mới giáo viên");
            System.out.println("3. Cập nhật thông tin giáo viên");
            System.out.println("4. Xóa giáo viên");
            System.out.println("5. Tìm kiếm giáo viên");
            System.out.println("6. Trở lại CodeGym menu");
            System.out.println("7. Thoát");
            System.out.print("Mời bạn nhập chức năng 1->6: ");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    iTeacherService.displayAllTeacher();
                    break;
                case 2:
                    iTeacherService.addNewTeacher();
                    break;
                case 3:
                    iTeacherService.editTeacher();
                    break;
                case 4:
                    iTeacherService.removeTeacher();
                    break;
                case 5:
                    return;
                case 6:
                    return;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng!");
            }
        }
    }
}
