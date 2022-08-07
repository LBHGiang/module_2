package ss3_arrays_and_methods_in_java.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 4, 3, 6, 7, 3, 1};

        System.out.print("Enter the element to add ");
        int element = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter the index to add ");
        int index = Integer.parseInt(scanner.nextLine());

        for (int i = array.length - 1; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        System.out.println(Arrays.toString(array));
    }
}
