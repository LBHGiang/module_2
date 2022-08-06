package ss3_arrays_and_methods_in_java.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseTheElementsOfAnArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Input length of array
        int length;
        length = inputNumber("length of array");

        //input element of array
        int[] array = inputElementForArray(length);

        //display array before reverse
        System.out.println("Array before reverse: ");
        System.out.println(Arrays.toString(array));

        //reverse array
        reverseArray(array);

        //display array after reverse
        System.out.println("Array after reverse: ");
        System.out.println(Arrays.toString(array));
    }

    //input length Test.method
    public static int inputNumber(String nameOfVariable) {
        Scanner scanner = new Scanner(System.in);

        int number;
        boolean numberIsInvalid;

        System.out.print("Enter the " + nameOfVariable);
        do {
            number = Integer.parseInt(scanner.nextLine());
            numberIsInvalid = number < 0 || number > 20;

            if (numberIsInvalid) {
                System.out.printf("Invalid input value\n" +
                        "Retype %s >=0 and %s <=20", nameOfVariable, nameOfVariable);
            }

        } while (numberIsInvalid);
        return number;

    }

    //input element Test.method
    public static int[] inputElementForArray(int length) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[length];
        int i;
        for (i = 0; i < length; i++) {
            System.out.printf("array[%d]= ", i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        return arr;
    }

    //reverse array Test.method
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
