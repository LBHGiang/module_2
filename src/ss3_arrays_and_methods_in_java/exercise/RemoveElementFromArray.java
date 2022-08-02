package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 3, 6, 7, 3, 1};

        System.out.print("Enter the element to remove ");
        int element = Integer.parseInt(scanner.nextLine());

        for (int i = 0, j = 0; i < array.length; j++) {
            if (j >= array.length) {
                array[i] = 0;
                i++;
                continue;
            }
            if (array[j] != element) {
                array[i] = array[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
