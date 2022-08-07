package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class SumTheNumbersInColumn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of Array ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.print("Input length of element array ");
        int width = Integer.parseInt(scanner.nextLine());

        double[][] array = inputElementForTwoDimensionalArray(length, width);

        System.out.print("Input the column index");
        int col = Integer.parseInt(scanner.nextLine());

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][col];
        }


        System.out.println("Array:");
        displayElementFromTwoDimensionalArray(array);
        System.out.printf("Sum of the numbers in %d column is %.2f", col, sum);
    }

    //input element for array method
    public static double[][] inputElementForTwoDimensionalArray(int length, int width) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[length][width];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.printf("array[%d][%d]= ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        return arr;
    }


    //display array method
    public static void displayElementFromTwoDimensionalArray(double[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
