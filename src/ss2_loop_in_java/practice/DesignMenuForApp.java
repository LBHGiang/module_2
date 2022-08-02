package ss2_loop_in_java.practice;

import java.util.Scanner;

public class DesignMenuForApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Menu:");
        System.out.println("1: Print triangle");
        System.out.println("2: Print rectangle");
        System.out.println("3: Print square");
        System.out.println("0: Exit!");

        int choose = Integer.parseInt(scanner.nextLine());


        while (choose != 1 && choose != 2 && choose != 3 && choose != 0) {
            System.out.println("Invalid input value, retype:");
            choose = Integer.parseInt(scanner.nextLine());
        }

        switch (choose) {
            case 0: {
                System.out.println("Exit!");
                break;
            }

            case 1: {
                System.out.println("1: Print triangle");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                break;
            }

            case 2: {
                System.out.println("2: Print rectangle");
                System.out.println("******");
                System.out.println("******");
                System.out.println("******");
                break;
            }

            case 3: {
                System.out.println("3: Print square");
                System.out.println("***");
                System.out.println("***");
                System.out.println("***");
                break;
            }

        }
    }
}
