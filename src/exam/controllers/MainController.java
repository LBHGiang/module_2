package exam.controllers;

import case_study.furama_resort.controllers.CustomerController;
import case_study.furama_resort.controllers.EmployeeController;
import case_study.furama_resort.controllers.FacilityController;

import java.util.Scanner;

public class MainController {
    private final Scanner scanner = new Scanner(System.in);

    private final EmployeeController employeeController = new EmployeeController();
    private final CustomerController customerController = new CustomerController();
    private final FacilityController facilityController = new FacilityController();

    public void displayMainMenu() {
        String choose;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome to Furama Resort");
            System.out.println("1\tEmployee Management");
            System.out.println("2\tCustomer Management");
            System.out.println("3\tFacility Management ");
            System.out.println("4\tBooking Management");
            System.out.println("5\tPromotion Management");
            System.out.println("6\tExit");
            System.out.print("Please enter the function 1->6: ");
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
                    System.out.println("Thanks and see you again!");
                    return;
                default:
                    System.out.println("Your choice is not correct! Please try again!");
            }
        }
    }


}
