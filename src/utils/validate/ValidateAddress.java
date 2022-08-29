package utils.validate;

import java.util.Scanner;

public class ValidateAddress {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Check định dạng address.
     * Tên huyện - tên tỉnh
     * Dấu . không nằm cuối
     * @param address address
     * @return boolean true/false đúng/không đúng định dạng
     */
    public static boolean validateAddress(String address) {
        final String ADDRESS_REGEX = "^(\\p{L}+(\\s\\p{L}+)*)\\s\\-\\s(\\p{L}+(\\s\\p{L}+)*)$";

        return address.matches(ADDRESS_REGEX);
    }

    //check cho vui
    public static void main(String[] args) {
        String email;
        while (true) {
            System.out.print("Enter email: ");
            email = scanner.nextLine();
            System.out.println(validateAddress(email));
        }
    }
}
