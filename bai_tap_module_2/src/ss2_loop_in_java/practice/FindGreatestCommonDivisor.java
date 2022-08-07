package ss2_loop_in_java.practice;

import java.util.Scanner;

public class FindGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào hai số nguyên dương:");

        System.out.print("Số thứ nhất:");
        int number1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Số thứ hai:");
        int number2 = Integer.parseInt(scanner.nextLine());

        int maxDivisor = 1;
        for (int i = 1; i <= number1; i++) {
            if (number1 % i == 0 && number2 % i == 0) {
                maxDivisor = i;
            }
        }
        System.out.printf("Ước chung lớn nhất là: %d", maxDivisor);
    }
}
