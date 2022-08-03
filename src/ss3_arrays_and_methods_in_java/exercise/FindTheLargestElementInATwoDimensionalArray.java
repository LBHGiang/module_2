package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class FindTheLargestElementInATwoDimensionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of Array ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.print("Input length of element array ");
        int width = Integer.parseInt(scanner.nextLine());

        int[][] array = inputElementForTwoDimensionalArray(length, width);

        findTheLargestElementInATwoDimensionalArray(array);


    }

    //input Element For Two Dimensional Array
    public static int[][] inputElementForTwoDimensionalArray(int length, int width) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[length][width];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("array[%d][%d]= ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return arr;
    }

    //Find max and index of max
    public static void findTheLargestElementInATwoDimensionalArray(int[][] arr) {

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Max = %d \n", max);

        System.out.println("Max of index:\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max == arr[i][j]) {
                    System.out.printf("[%d][%d]\t", i, j);

                }
            }
        }


    }
}
