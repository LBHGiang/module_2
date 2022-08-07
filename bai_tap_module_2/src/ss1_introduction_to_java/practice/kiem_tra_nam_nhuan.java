package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class kiem_tra_nam_nhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một năm để kiểm tra");
        int year = Integer.parseInt(scanner.nextLine());

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("Năm '%d' là năm nhuận", year);
        } else {
            System.out.printf("Năm '%d' là năm thường", year);
        }

    }
}
