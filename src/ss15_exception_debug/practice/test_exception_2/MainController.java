package ss15_exception_debug.practice.test_exception_2;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập số thứ hai");
        int number2 = Integer.parseInt(scanner.nextLine());
        Calculator.calculate(number1,number2);

    }
}
