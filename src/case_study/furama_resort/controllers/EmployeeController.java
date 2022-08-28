package case_study.furama_resort.controllers;

import case_study.furama_resort.services.IEmployeeService;
import case_study.furama_resort.services.impls.EmployeeService;

import java.util.Scanner;

public class EmployeeController {
    private static final Scanner scanner = new Scanner(System.in);
    IEmployeeService iEmployeeService = new EmployeeService();

    public void displayEmployeeMenu() {
        String choose;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("Welcome to employee management:");
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            System.out.println("5\tExit");
            System.out.print("Please enter the function 1->5: ");
            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    iEmployeeService.displayList();
                    break;
                case "2":
                    iEmployeeService.addNewObject();
                    break;
                case "3":
                    iEmployeeService.editInfo();
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
