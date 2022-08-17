package ss13_search_algorithm.practice.binary_search_not_recursion;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println("Mảng đã cho: " + Arrays.toString(list));

        System.out.print("Nhập vào số cần tìm kiếm: number = ");
        int number = Integer.parseInt(scanner.nextLine());

        int index = BinarySearch.binarySearch(list, number);
        System.out.println("Vị trí của number " + number + " là: " + index);
    }
}
