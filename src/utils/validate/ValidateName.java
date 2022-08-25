package utils.validate;

import java.util.Scanner;

public class ValidateName {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Tên không được chứa số và ký tự đặc biệt.
     * Yêu cầu chỉ từ 5 đến 50 kí tự
     *Được phép viết thường hoặc viết hoa
     * @param name tên
     * @return true/false đúng định dạng hoặc không.
     */
    public static boolean validateName(String name) {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";//dễ dãi
//        final String NAME_REGEX = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$"; //khắt khe
        int length = name.length();
        return name.matches(NAME_REGEX) && length > 5 && length <= 50;
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
