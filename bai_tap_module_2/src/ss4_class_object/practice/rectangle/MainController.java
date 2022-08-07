package ss4_class_object.practice.rectangle;

import java.util.Scanner;

public class MainController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter the height: ");
        double height = Double.parseDouble(scanner.nextLine());

        Rectangle rectangle1 = new Rectangle(width, height);

        System.out.println("Your rectangle: " + rectangle1.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle1.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle1.getArea());

    }
}
