package ss3_arrays_and_methods_in_java.exercise;

import java.util.Scanner;

public class CountOccurrencesOfCharacterInString {
    public static void main(String[] args) {

        String string = "Hello world";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 Character: ");
        Character c = scanner.nextLine().charAt(0);

        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (c == string.charAt(i)) {
                count++;
            }
        }

        System.out.printf("String: %s\n", string);
        System.out.printf("The number of occurrences: %d", count);

    }

}
