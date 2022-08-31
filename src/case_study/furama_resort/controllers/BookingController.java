package case_study.furama_resort.controllers;

import case_study.furama_resort.services.IBookingService;
import case_study.furama_resort.services.IContractService;
import case_study.furama_resort.services.impls.BookingService;
import case_study.furama_resort.services.impls.ContractService;

import java.util.Scanner;

public class BookingController {
    private final Scanner scanner = new Scanner(System.in);
    private final IBookingService iBookingService = new BookingService();
    private final IContractService iContractService = new ContractService();

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
                    iBookingService.addNewObject();
                    break;
                case "2":
                    iBookingService.displayList();
                    break;
                case "3":
                    iContractService.addNewObject();
                    break;
                case "4":
                    iContractService.displayList();
                    break;
                case "5":
                    System.out.println("Unused feature. Sorry");
                    break;
                case "6":
                    return;
                case "7":
                    System.out.println("Thanks and see you again!");
                    System.exit(0);
                default:
                    System.out.println("Your choice is not correct!");
            }
        }
    }
}
