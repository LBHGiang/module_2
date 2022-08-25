package utils.validate;

import java.util.Scanner;

public class ValidateEmail {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Check định dạng email.
     * Tên: ký tự hoặc số + @ + Đuôi: ký tự hoặc số hoặc 1 dấu .
     * Dấu . không nằm cuối
     * @param email email
     * @return boolean true/false đúng/không đúng định dạng
     */
    public static boolean validateEmail(String email) {
        final String emailRegex = "[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)";

        return email.matches(emailRegex);
    }

    //check cho vui
    public static void main(String[] args) {
        String email;
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            System.out.println(validateEmail(email));
        }
    }
}
