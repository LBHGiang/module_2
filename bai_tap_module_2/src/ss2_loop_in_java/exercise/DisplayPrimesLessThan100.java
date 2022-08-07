package ss2_loop_in_java.exercise;

import java.util.Scanner;

public class DisplayPrimesLessThan100 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phạm vi (ví dụ < 100)");
        int range = Integer.parseInt(scanner.nextLine());

        int number = 2;

        boolean isPrime;
        while (number < range) {
            isPrime = true;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + "\t");
            }

            number++;
        }
    }
}
