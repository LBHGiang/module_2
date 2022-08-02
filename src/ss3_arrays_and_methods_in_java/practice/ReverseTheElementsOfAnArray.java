package ss3_arrays_and_methods_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheElementsOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào độ dài mảng:");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int [length];

        //Nhập phần tử cho mảng.
        for (int i = 0; i < length; i++) {
            System.out.printf("array[%d]= ",i);
            array[i]= Integer.parseInt(scanner.nextLine());
        }

        //Đảo ngược mảng.
        for (int i = 0; i < length; i++) {

        }

        System.out.println(Arrays.toString(array));
    }
}
