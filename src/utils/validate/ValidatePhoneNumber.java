package utils.validate;

import java.util.Scanner;

public class ValidatePhoneNumber {
    private static Scanner scanner = new Scanner(System.in);


    /**
     * Số điện thoại hợp lệ cần đạt theo mẫu sau: (xx)-(0xxxxxxxxx)
     * x là ký tự số
     * Không chứa các ký tự đặc biệt
     * Ví dụ số điện thoại hợp lệ: (84)-(0978489648)
     * Ví dụ tên lớp không hợp lệ: (a8)-(22222222)
     *
     * @param phoneNumber tên lớp
     * @return true/false đúng định dạng hoặc không
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
        final String phoneNumberRegex = "[(]\\d{2}[)][-][(]0\\d{9}[)]";
        return phoneNumber.matches(phoneNumberRegex);
    }

    //check cho vui
    public static void main(String[] args) {
        String phoneNumber;
        while (true) {
            System.out.print("Enter phoneNumber: ");
            phoneNumber = scanner.nextLine();
            System.out.println(validatePhoneNumber(phoneNumber));
        }
    }

}
