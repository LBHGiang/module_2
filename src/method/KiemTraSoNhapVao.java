package method;

import java.util.Scanner;

public class KiemTraSoNhapVao {

    public static void main(String[] args) {
        int amount;
        amount = inputNumber("Số lượng");
    }

    public static int inputNumber(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean numberIsInvalid;

        System.out.print("Enter the " + nameOfVariable);
        do {
            number = Integer.parseInt(scanner.nextLine());
            numberIsInvalid = number < 0 || number > 20;

            if (numberIsInvalid) {
                System.out.printf("Invalid input value\n" +
                        "Retype %s >=0 and %s <=20", nameOfVariable, nameOfVariable);
            }

        } while (numberIsInvalid);
        return number;

    }
}
