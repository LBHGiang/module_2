package ss3_arrays_and_methods_in_java.practice;

import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya",
                "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the student name: ");
        String name = scanner.nextLine();

        getTheIndexOfElement(students, name);

    }

    public static void getTheIndexOfElement(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                System.out.printf("Position of the element '%s' in the list is %d", str, i);
                return;
            }
        }
        System.out.printf("Not found '%s' in the list.", str);
    }
}
