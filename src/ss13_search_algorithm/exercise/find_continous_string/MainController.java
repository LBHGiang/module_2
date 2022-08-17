package ss13_search_algorithm.exercise.find_continous_string;

import java.util.Scanner;


public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào một chuỗi: ");
        String string = scanner.nextLine();

        String longestString;
        longestString = FindContinuousString.findAscendingContinuousString(string);
        System.out.print("Chuỗi tăng dần liên tiếp dài nhất là: " + longestString);
    }

}
