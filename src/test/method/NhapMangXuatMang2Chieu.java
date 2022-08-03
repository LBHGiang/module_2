package test.method;

import java.util.Arrays;
import java.util.Scanner;

public class NhapMangXuatMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input length of Array ");
        int length = Integer.parseInt(scanner.nextLine());

        System.out.print("Input length of element array ");
        int width = Integer.parseInt(scanner.nextLine());

        int[][] array = inputElementForTwoDimensionalArray(length, width);
//        System.out.println(Arrays.deepToString(array));

        displayElementFromTwoDimensionalArray(array);

    }

    //Nhập phần tử cho mảng 2 chiều có kích thước length x width;
    //truyền 2 tham số length, length mảng con
    //input element for array method
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

    //Hiển thị mảng 2 chiều bằng vòng lặp
    //display array method
    public static void displayElementFromTwoDimensionalArray(int[][] arr) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
