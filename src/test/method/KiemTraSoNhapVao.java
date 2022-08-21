package test.method;

import java.util.Scanner;

public class KiemTraSoNhapVao {

    public static void main(String[] args) {
        int amount;
        amount = inputNumber("Amount");
    }

    /**
     * Hàm nhập số với điều kiện cho trước. > 0 và <= 20
     * @param nameOfVariable Tên biến VD: "Chiều dài mảng"
     * @return Một số nguyên
     */
    public static int inputNumber(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean numberIsInvalid;

        do {
            System.out.print("Enter " + nameOfVariable);
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
