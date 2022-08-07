package ss4_class_object.exercise.quadratic_equation;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = Double.parseDouble(scanner.nextLine());

        System.out.print("b = ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.print("c = ");
        double c = Double.parseDouble(scanner.nextLine());

        QuadraticEquation quadraticEquation1 = new QuadraticEquation(a, b, c);

        if (quadraticEquation1.getDelta() < 0) {
            System.out.println("The equation has no roots");
        } else if (quadraticEquation1.getDelta() == 0) {
            System.out.println("Double roots: " + quadraticEquation1.getRoot1());
        } else {
            System.out.printf("Root 1 = %f\t Root 2 = %f\n", quadraticEquation1.getRoot1(), quadraticEquation1.getRoot2());
        }


    }
}
