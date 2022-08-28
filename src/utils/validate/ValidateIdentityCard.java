package utils.validate;

import java.util.Scanner;

public class ValidateIdentityCard {
    private static Scanner scanner = new Scanner(System.in);


    /**
     * Số CMND hợp lệ gồm 9 số, số đầu tiên khác 0
     *
     * @param identityCard số cmnd
     * @return true/false đúng định dạng hoặc không
     */
    public static boolean validateIdentityCard(String identityCard) {
        final String IDENTITY_CARD_REGEX = "^[1-9][0-9]{8}$";
        return identityCard.matches(IDENTITY_CARD_REGEX);
    }

    //check cho vui
    public static void main(String[] args) {
        String phoneNumber;
        while (true) {
            System.out.print("Enter phoneNumber: ");
            phoneNumber = scanner.nextLine();
            System.out.println(validateIdentityCard(phoneNumber));
        }
    }

}
