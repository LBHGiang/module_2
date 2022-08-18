package ss14_sort_algorithm.practice.setting_bubble_sort;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

        System.out.println("Before: " + Arrays.toString(list));
        BubbleSort.bubbleSort(list);
        System.out.println("After: " + Arrays.toString(list));
    }
}
