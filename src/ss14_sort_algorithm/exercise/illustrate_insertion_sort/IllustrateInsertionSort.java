package ss14_sort_algorithm.exercise.illustrate_insertion_sort;

import java.util.Arrays;

public class IllustrateInsertionSort {

    public static void insertionSort(int[] arr) {
        System.out.println("Before : " + Arrays.toString(arr));
        int temp;
        int count = 0;

        for (int i = 1; i < arr.length; i++) {
            count++;
            System.out.println("________________________");
            System.out.printf("%-10s : %s \n", "Vòng", count);
            System.out.println(Arrays.toString(arr));

            temp = arr[i];
            System.out.printf("%-10s : %s \n", "Lấy ra", temp);
            int j;
            for (j = i - 1; j >= 0 && temp < arr[j]; j--) {
                System.out.printf("%s nhỏ hơn %s, di chuyển %s sang phải\n", temp, arr[j], arr[j]);
                arr[j + 1] = arr[j];
                System.out.println(Arrays.toString(arr));
            }
            System.out.printf("Tại vị trí %s, %s thỏa mãn điều kiện sắp xếp, chèn %s vào:\n", j + 1, temp, temp);
            arr[j + 1] = temp;
            System.out.println(Arrays.toString(arr));
        }
        System.out.println("After: " + Arrays.toString(arr));

    }
}

