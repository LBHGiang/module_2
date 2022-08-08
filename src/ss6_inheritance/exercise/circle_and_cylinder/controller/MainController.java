package ss6_inheritance.exercise.circle_and_cylinder.controller;

import ss6_inheritance.exercise.circle_and_cylinder.model.Circle;
import ss6_inheritance.exercise.circle_and_cylinder.model.Cylinder;

public class MainController {
    public static void main(String[] args) {
        Circle circle1 = new Circle(2.0, "Red");
        System.out.println(circle1);
        System.out.printf("Area is: %.2f \n", circle1.getArea());

        Cylinder cylinder1 = new Cylinder(10.0, 2.0, "Blue");
        System.out.println(cylinder1);
        System.out.printf("The bottom area: %.2f and the volume :%.2f", cylinder1.getArea(), cylinder1.getVolume());

    }
}
