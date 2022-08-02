package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ReadNumberIntoEnglishWords {
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
            switch (number / 100) {
                case 1:
                    reading += "One Hundred";
                    break;
                case 2:
                    reading += "Two Hundred";
                    break;
                case 3:
                    reading += "Three Hundred";
                    break;
                case 4:
                    reading += "Four Hundred";
                    break;
                case 5:
                    reading += "Five Hundred";
                    break;
                case 6:
                    reading += "Six Hundred";
                    break;
                case 7:
                    reading += "Seven Hundred";
                    break;
                case 8:
                    reading += "Eight Hundred";
                    break;
                case 9:
                    reading += "Nine Hundred";
            }
            //Thêm and cho các số khác 0xx và x00
            if (number / 100 != 0 && number % 100 != 0) {
                reading += " and ";
            }
            if ((number / 10) % 10 == 1) {
                switch (number % 100) {
                    //đọc các số từ 10-19
                    case 10:
                        reading += "ten";
                        break;
                    case 11:
                        reading += "eleven";
                        break;
                    case 12:
                        reading += "twelve";
                        break;
                    case 13:
                        reading += "thirteen";
                        break;
                    case 14:
                        reading += "fourteen";
                        break;
                    case 15:
                        reading += "fifteen";
                        break;
                    case 16:
                        reading += "sixteen";
                        break;
                    case 17:
                        reading += "seventeen";
                        break;
                    case 18:
                        reading += "eighteen";
                        break;
                    case 19:
                        reading += "nineteen";
                }
            } else {
                //đọc số hàng chục
                switch ((number / 10) % 10) {
                    case 2:
                        reading += "twenty";
                        break;
                    case 3:
                        reading += "thirty";
                        break;
                    case 4:
                        reading += "forty";
                        break;
                    case 5:
                        reading += "fifty";
                        break;
                    case 6:
                        reading += "sixty";
                        break;
                    case 7:
                        reading += "seventy";
                        break;
                    case 8:
                        reading += "eighty";
                        break;
                    case 9:
                        reading += "ninety";
                }
                reading += " ";
                //đọc số hàng đơn vị
                switch (number % 10) {
                    case 1:
                        reading += "one";
                        break;
                    case 2:
                        reading += "two";
                        break;
                    case 3:
                        reading += "three";
                        break;
                    case 4:
                        reading += "four";
                        break;
                    case 5:
                        reading += "five";
                        break;
                    case 6:
                        reading += "six";
                        break;
                    case 7:
                        reading += "seven";
                        break;
                    case 8:
                        reading += "eight";
                        break;
                    case 9:
                        reading += "nine";
                }
            }

        }


//        System.out.println("số đã nhâp: " + number);
//        System.out.println("Cách đọc: " + reading);

        System.out.printf("%-20s%d\n", "Số đã nhập:", number);
        System.out.printf("%-20s%s", "Cách đọc:", reading);
    }
}
