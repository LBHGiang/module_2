package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberIntoEnglishWords2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number =");
        int number = Integer.parseInt(scanner.nextLine());

        String reading = "";
        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else if (number == 0) {
            reading += "zero";
        } else {

            //đọc số hàng trăm
            String[] hundreds = {
                    "",
                    "One hundred",
                    "Two hundred",
                    "Three hundred",
                    "Four hundred",
                    "Five hundred",
                    "Six hundred",
                    "Seven hundred",
                    "Eight hundred",
                    "Nine hundred"
            };
            reading += hundreds[number / 100];

            //Thêm and cho các số khác 0xx và x00
            if (number / 100 != 0 && number % 100 != 0) {
                reading += " and ";
            }

            if ((number / 10) % 10 == 1) {
                //đọc các số 10-19
                String[] fromTenToNineTeen = {
                        "ten",
                        "eleven",
                        "twelve",
                        "thirteen",
                        "fourteen",
                        "fifteen",
                        "sixteen",
                        "seventeen",
                        "eighteen",
                        "nineteen"
                };
                reading += fromTenToNineTeen[number % 100 - 10];

            } else {
                //đọc số hàng chục
                String[] tens = {
                        "",
                        "",
                        "twenty",
                        "thirty",
                        "forty",
                        "fifty",
                        "sixty",
                        "seventy",
                        "eighty",
                        "ninety"
                };
                reading += tens[(number / 10) % 10] + " ";

                //đọc số hàng đơn vị
                String[] units = {
                        "",
                        "one",
                        "two",
                        "three",
                        "four",
                        "five",
                        "six",
                        "seven",
                        "eight",
                        "nine"
                };
                reading += units[number % 10];
            }
        }
        System.out.printf("%-20s%d\n", "Số đã nhập:", number);
        System.out.printf("%-20s%s", "Cách đọc:", reading);
    }
}
