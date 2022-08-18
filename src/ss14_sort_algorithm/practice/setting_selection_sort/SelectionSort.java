package ss14_sort_algorithm.practice.setting_selection_sort;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int minIndex;
        int temp;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            //swap
            if (minIndex != i) {
                temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }

    }
}
