package ss3_arrays_and_methods_in_java.practice;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n là số lớn nhất trong hình thoi");
        int n = Integer.parseInt(scanner.nextLine()) + 1;

        for (int i = -n; i <= n; i++) {
            if (Math.abs(i) == n||i == 0 || i == -1) {
                continue;
            }
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) == n) {
                    System.out.print(Math.abs(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

    }
}

