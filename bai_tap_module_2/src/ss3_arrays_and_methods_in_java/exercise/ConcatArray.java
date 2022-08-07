package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length of array1:");
        int length1 = Integer.parseInt(scanner.nextLine());
        int[] array1 = new int[length1];

        //Nhập phần tử cho mảng1.
        for (int i = 0; i < length1; i++) {
            System.out.printf("array[%d]= ", i);
            array1[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.print("Enter length of array2:");
        int length2 = Integer.parseInt(scanner.nextLine());
        int[] array2 = new int[length2];

        //Nhập phần tử cho mảng 2.
        for (int i = 0; i < length2; i++) {
            System.out.printf("array[%d]= ", i);
            array2[i] = Integer.parseInt(scanner.nextLine());
        }

        //Nối 2 mảng
        int[] array3 = new int[length1 + length2];
        for (int i = 0; i < length1; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < length2; i++) {
            array3[length1 + i] = array2[i];
        }

        System.out.println(Arrays.toString(array3));
    }
}
