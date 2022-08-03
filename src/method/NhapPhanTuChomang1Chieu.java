package method;

import java.util.Arrays;
import java.util.Scanner;

public class NhapPhanTuChomang1Chieu {
    public static void main(String[] args) {
        int length = 5;
        int[] array = inputElementForArray(length);
        System.out.println(Arrays.toString(array));
    }

    // Nhập phần tử cho mảng số nguyên, truyền vào độ dài mảng
    public static int[] inputElementForArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[length];
        int i;
        for (i = 0; i < length; i++) {
            System.out.printf("array[%d]= ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

}

