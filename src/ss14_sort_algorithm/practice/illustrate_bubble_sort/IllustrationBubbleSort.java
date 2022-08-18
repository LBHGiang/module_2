package ss14_sort_algorithm.practice.illustrate_bubble_sort;

import java.util.Arrays;

public class IllustrationBubbleSort {
    /**
     * Sắp xếp theo thuật toán sắp xếp nổi bọt.
     *
     * @param arr - Một mảng số nguyên
     */
    public static void bubbleSort(int[] arr) {
        System.out.printf("%-10s : %s \n", "Before", Arrays.toString(arr));
        boolean needSwap = true;
        int temp;

        int count = 0; //Đếm số lần lặp
        for (int i = 0; i < arr.length - 1 && needSwap; i++) {
            count++;
            System.out.println("________________________");
            System.out.printf("%-10s : %s \n", "Vòng", count);
            System.out.printf("%-10s : \n", Arrays.toString(arr));
            needSwap = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    System.out.printf("%-10s : %s vs %s \n", "Swap", arr[j], arr[j + 1]);
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needSwap = true;

                    //Đổi chổ
                    System.out.println(Arrays.toString(arr));
                }
            }
            if (!needSwap) {
                System.out.println("Các phần tử trong mảng đã được sắp xếp");

            }
        }
        System.out.printf("%-10s : %s \n", "After", Arrays.toString(arr));
    }
}
