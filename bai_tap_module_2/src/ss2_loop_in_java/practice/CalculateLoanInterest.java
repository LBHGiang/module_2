package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CalculateLoanInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tiền lãi cho vay (trVnĐ):");
        double amount = Double.parseDouble(scanner.nextLine());


        System.out.print("Nhập tỉ lệ lãi suất theo tháng:");
        double interestRate = Double.parseDouble(scanner.nextLine());

        System.out.print("Nhập số tháng cho vay: ");
        int months = Integer.parseInt(scanner.nextLine());

        double interest = amount * interestRate * months;

        System.out.printf("Số tiền lãi sau %d tháng là: %.2f trVnĐ", months, interest);

    }
}
