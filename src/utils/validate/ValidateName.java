package utils.validate;

import java.util.Scanner;

public class ValidateName {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Tên không được chứa số và ký tự đặc biệt.
     * Yêu cầu chỉ từ 5 đến 50 kí tự
     *
     * @param name tên
     * @return true/false đúng định dạng hoặc không.
     */
    public static boolean validateName(String name) {
        final String nameRegex = "[\\W\\D]{5,50}$";
        return name.matches(nameRegex) && !name.contains("_");
    }

    //check cho vui
    public static void main(String[] args) {
        String name;
        while (true) {
            System.out.print("Enter name: ");
            name = scanner.nextLine();
            System.out.println(validateName(name));
        }
    }
}
