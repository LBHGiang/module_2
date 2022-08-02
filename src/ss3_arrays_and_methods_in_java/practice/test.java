package ss3_arrays_and_methods_in_java.practice;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 0, 0};
        int index = 2;
        int k = 5;
        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = k;
        System.out.println(Arrays.toString(array));
    }
}
