package ss19_string_regex.practice.validate_email;

import java.util.Scanner;

public class ValidateEmail {

    private static Scanner scanner = new Scanner(System.in);

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
