package case_study.furama_resort.controllers;

import case_study.furama_resort.services.ICustomerService;
import case_study.furama_resort.services.impls.CustomerService;

import java.util.Scanner;

public class CustomerController {
    private final Scanner scanner = new Scanner(System.in);
    private ICustomerService iCustomerService = new CustomerService();
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
                    iCustomerService.displayList();
                    break;
                case "2":
                    iCustomerService.addNewObject();
                    break;
                case "3":
                    iCustomerService.editInfo();
                    break;
                case "4":
                    return;
                case "5":
                    System.out.println("Thanks and see you again!");
                    System.exit(0);
                default:
                    System.out.println("Your choice is not correct!");
            }
        }
    }
}
