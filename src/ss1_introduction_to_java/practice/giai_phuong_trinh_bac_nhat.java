package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class giai_phuong_trinh_bac_nhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập hệ số a: ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập hệ số b: ");
        double b = Double.parseDouble(scanner.nextLine());

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            System.out.println("Phương trình có 1 nghiệm: " + (-b / a));
        }
    }
}
