package ss1_introduction_to_java.practice;

import java.util.Scanner;

public class tinh_dien_tich_hinh_chu_nhat {
    public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width ");
        width = Float.parseFloat(scanner.nextLine());

        System.out.println("Enter height ");
        height = Float.parseFloat(scanner.nextLine());

        float area = width * height;
        System.out.println("Area is " + area);

    }
}
