package ss13_search_algorithm.exercise.binary_search_use_recursion;

import ss13_search_algorithm.exercise.find_ascending_string.FindAscendingString;

import java.util.Arrays;
import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập vào chiều dài mảng: ");
        int length = Integer.parseInt(scanner.nextLine());

        int[] array = new int[length];
        inputElementForArray(array);

        System.out.println("Mảng đã nhập (sau khi sắp xếp) là: ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.print("Hãy nhập vào số cần tìm kiếm: ");
        int number = Integer.parseInt(scanner.nextLine());

        int index = BinarySearchByRecursion.binarySearch(array, number, 0, array.length - 1);

        System.out.println("Vị trị tìm thấy " + index);
    }

    public static void inputElementForArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("array[%d]= ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }
}
