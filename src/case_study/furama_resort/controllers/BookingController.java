package case_study.furama_resort.controllers;

import java.util.Scanner;

public class BookingController {
    private final Scanner scanner = new Scanner(System.in);
    private String choose;

    public void displayBookingMenu() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome to booking management:");
            System.out.println("1\tAdd new booking");
            System.out.println("2\tDisplay list booking");
            System.out.println("3\tCreate new contracts");
            System.out.println("4\tDisplay list contracts");
            System.out.println("5\tEdit contracts");
            System.out.println("6\tReturn main menu");
            System.out.println("7\tExit");
            System.out.print("Please enter the function 1->7: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":

                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    break;
                case "6":
                    return;
                case "7":
                    System.exit(0);
                default:
                    System.out.println("Your choice is not correct!");
            }
        }
    }
}
