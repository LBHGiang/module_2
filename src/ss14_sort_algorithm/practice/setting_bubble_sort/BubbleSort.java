package ss14_sort_algorithm.practice.setting_bubble_sort;

public class BubbleSort {
    /**
     * Sắp xếp theo thuật toán sắp xếp nổi bọt.
     *
     * @param arr - Một mảng số nguyên
     */
    public static void bubbleSort(int[] arr) {
        boolean needSwap = true;
        int temp;

        for (int i = 0; i < arr.length - 1 && needSwap; i++) {
            needSwap = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    needSwap = true;
                }
            }
        }
    }
}
