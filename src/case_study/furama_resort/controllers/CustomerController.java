package case_study.furama_resort.controllers;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);
    private String choose;

    public void displayCustomerMenu() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome to customer management:");
            System.out.println("1\tDisplay list customers");
            System.out.println("2\tAdd new customer");
            System.out.println("3\tEdit customer");
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
