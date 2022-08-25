package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils;

import java.util.Scanner;

public class ValidateClassName {
    private static Scanner scanner = new Scanner(System.in);


    /**
     * Hàm check định dạng tên lớp học.
     * Tên lớp phải đúng định dạng (A|C)XXXX(G|I)X
     * với X là các số từ 0 -> 9
     *
     * @param className tên lớp
     * @return true/false đúng định dạng hoặc không.
     */
    public static boolean validateClassName(String className) {
        final String classNameRegex = "[CAP]\\d{4}[GHIKLM]";
        return className.matches(classNameRegex);
    }

    //check cho vui
    public static void main(String[] args) {
        String className;
        while (true) {
            System.out.print("Enter account name: ");
            className = scanner.nextLine();
            System.out.println(validateClassName(className));
        }
    }

}
