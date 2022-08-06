package test.method;

import java.util.Arrays;
import java.util.Scanner;

public class NhapPhanTuChomang1Chieu {
    public static void main(String[] args) {
        int length = 5;
        int[] array = new int[length];
        inputElementForArray(array);
        System.out.println(Arrays.toString(array));
    }

    // Nhập phần tử cho mảng số nguyên, tham số truyền vào là một mảng
    public static void inputElementForArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("array[%d]= ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
    }

}

