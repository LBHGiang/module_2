package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class SumTheNumbersInMainDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of square matrix ");
        int length = Integer.parseInt(scanner.nextLine());

        double[][] array = inputElementForTwoDimensionalArray(length);

        double sum = 0;
        for (int i = 0; i < length; i++) {
            sum += array[i][i];
        }

        System.out.println("Array:");
        displayElementFromTwoDimensionalArray(array);
        System.out.printf("Sum of the numbers in main diagonal is %f", sum);
    }

    //input element for array method
    public static double[][] inputElementForTwoDimensionalArray(int length) {
        Scanner scanner = new Scanner(System.in);
        double[][] arr = new double[length][length];

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
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
