package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayFirst20Primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng Số nguyên tố cần xuất:");
        int amount = Integer.parseInt(scanner.nextLine());

        int count = 0;
        int number = 2;
        boolean isPrime;
        while (count < amount) {
            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(number + "\t");
                count++;
            }
            number++;
        }
    }
}
