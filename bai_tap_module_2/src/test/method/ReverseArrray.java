package test.method;

import java.util.Scanner;

public class ReverseArrray {
    public static int[] reverseArray(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        int i;
        int temporary;
        for (i = 0; i < arr.length / 2; i++) {
            temporary = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temporary;
        }
        return arr;
    }
}
