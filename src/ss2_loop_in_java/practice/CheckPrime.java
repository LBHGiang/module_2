package ss2_loop_in_java.practice;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một số nguyên: ");
        int number = Integer.parseInt(scanner.nextLine());

        boolean isPrime = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.printf("Số nhập vào '%d' là số nguyên tố", number);
        } else {
            System.out.printf("Số nhập vào '%d' không là số nguyên tố", number);
        }
    }
}
