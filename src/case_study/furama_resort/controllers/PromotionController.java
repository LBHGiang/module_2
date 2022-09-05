package case_study.furama_resort.controllers;

import case_study.furama_resort.services.IPromotionService;
import case_study.furama_resort.services.impls.PromotionService;

import java.util.Scanner;

public class PromotionController {
    private final Scanner scanner = new Scanner(System.in);
    private final IPromotionService iPromotionService = new PromotionService();
    private String choose;

    public void displayPromotionMenu() {
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome promotion management:");
            System.out.println("1\tDisplay list customers use service");
            System.out.println("2\tDisplay list customers get voucher");
            System.out.println("3\tReturn main menu");
            System.out.println("4\tExit");
            System.out.print("Please enter the function 1->4: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    iPromotionService.displayListCustomersUseService();
                    break;
                case "2":
                    break;
                case "3":
                    return;
                case "4":
                    System.exit(0);
                default:
                    System.out.println("Your choice is not correct!");
            }
        }
    }
}
