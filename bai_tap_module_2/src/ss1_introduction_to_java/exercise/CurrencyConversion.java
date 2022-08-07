package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng USD: ");
        double mount = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.2f USD = %.2f VND", mount, mount * 20000);
    }
}
