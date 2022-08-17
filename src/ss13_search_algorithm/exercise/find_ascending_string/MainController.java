package ss13_search_algorithm.exercise.find_ascending_string;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào một chuỗi: ");
        String string = scanner.nextLine();

        String longestAscendingString;
        longestAscendingString = FindAscendingString.findAscendingString(string);
        System.out.print("Chuỗi tăng dần dài nhất là: " + longestAscendingString);
    }
}
