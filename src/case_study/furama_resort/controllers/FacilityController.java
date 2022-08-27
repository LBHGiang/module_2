package case_study.furama_resort.controllers;

import java.util.Scanner;

public class FacilityController {
    private final Scanner scanner = new Scanner(System.in);
    private String choose;

    public void displayFacilityMenu() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome to Facility Management:");
            System.out.println("1\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tDisplay list facility maintenance");
            System.out.println("4\tReturn main menu");
            System.out.println("5\tExit");
            System.out.print("Please enter the function 1->5: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    return;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Your choice is not correct!");
            }
        }
    }
}
