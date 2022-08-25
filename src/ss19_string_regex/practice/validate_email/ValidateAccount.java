package ss19_string_regex.practice.validate_email;

import java.util.Scanner;

public class ValidateAccount {
    private static Scanner scanner = new Scanner(System.in);

    public static boolean validateAccount(String account) {
        final String accountRegex = "[a-z1-6\\_]{6,}";
        return account.matches(accountRegex);
    }

    //check cho vui
    public static void main(String[] args) {
        String account;
        while (true) {
            System.out.print("Enter account name: ");
            account = scanner.nextLine();
            System.out.println(validateAccount(account));
        }
    }
}
