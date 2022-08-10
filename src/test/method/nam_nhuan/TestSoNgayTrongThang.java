package test.method.nam_nhuan;

import java.util.Scanner;

public class TestSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HamKiemTraNamNhuan check = new HamKiemTraNamNhuan();

        int year = Integer.parseInt(scanner.nextLine());
        System.out.println(check.isLeapYear(year));
    }
}
