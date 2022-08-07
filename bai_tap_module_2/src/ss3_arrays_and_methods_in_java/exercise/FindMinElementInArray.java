package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;

public class FindMinElementInArray {
    public static void main(String[] args) {

        int[] array = {8, 4, 2, 5, 7, 4, 2};
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.println("Array:");
        System.out.println(Arrays.toString(array));
        System.out.println("min = " + min);

    }

}
