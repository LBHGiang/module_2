package utils.validate;

import java.util.Scanner;

public class ValidateAccount {
    private static Scanner scanner = new Scanner(System.in);


    /**
     * Check định dạng tài khoản.
     * Không chứa các ký tự đặc biệt
     * Ít nhất là 6 ký tự
     * Không chứa các ký tự viết hoa
     * Cho phép dấu gạch dưới (_)
     * @param account tên tài khoản
     * @return boolean true/false đúng/không đúng định dạng
     */
    public static boolean validateAccount(String account) {
        final String accountRegex = "[a-z1-9\\_]{6,}";
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
