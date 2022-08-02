package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberIntoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int number = Integer.parseInt(scanner.nextLine());

        String hundreds = "";
        switch (number / 100) {
            case 0:
                hundreds = "Không trăm";
                break;
            case 1:
                hundreds = "Một trăm";
                break;
            case 2:
                hundreds = "Hai trăm";
                break;
            case 3:
                hundreds = "Ba trăm";
                break;
            case 4:
                hundreds = "Bốn trăm";
                break;
            case 5:
                hundreds = "Năm trăm";
                break;
            case 6:
                hundreds = "Sáu trăm";
                break;
            case 7:
                hundreds = "Bảy trăm";
                break;
            case 8:
                hundreds = "Tám trăm";
                break;
            case 9:
                hundreds = "Chín trăm";
        }

        String tens = "";
        switch ((number / 10) % 10) {
            case 0:
                tens = "lẻ";
                break;
            case 1:
                tens = "mười";
                break;
            case 2:
                tens = "hai mươi";
                break;
            case 3:
                tens = "ba mươi";
                break;
            case 4:
                tens = "bốn mươi";
                break;
            case 5:
                tens = "năm mươi";
                break;
            case 6:
                tens = "sáu mươi";
                break;
            case 7:
                tens = "bảy mươi";
                break;
            case 8:
                tens = "tám mươi";
                break;
            case 9:
                tens = "chín mươi";
        }

        String units = "";
        switch (number % 10) {
            case 1:
                units = "một";
                break;
            case 2:
                units = "hai";
                break;
            case 3:
                units = "ba";
                break;
            case 4:
                units = "bốn";
                break;
            case 5: {
                if (!tens.equals("lẻ")) {
                    units = "lăm";
                    break;
                }
                units = "năm";
                break;
            }
            case 6:
                units = "sáu";
                break;
            case 7:
                units = "bảy";
                break;
            case 8:
                units = "tám";
                break;
            case 9:
                units = "chín";
                break;
        }
//        System.out.println("số đã nhâp: " + number);
//        System.out.println("Cách đọc: " + hundreds + " " + tens + " " + units);

        System.out.printf("%-20s%d\n", "Số đã nhập:", number);
        System.out.printf("%-20s%s %s %s", "Cách đọc:", hundreds, tens, units);
    }
}
