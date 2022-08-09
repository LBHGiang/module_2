package ss6_inheritance.practice.system_geometric_objects.controller;

import ss6_inheritance.practice.system_geometric_objects.model.Circle;
import ss6_inheritance.practice.system_geometric_objects.model.Rectangle;
import ss6_inheritance.practice.system_geometric_objects.model.Shape;
import ss6_inheritance.practice.system_geometric_objects.model.Square;

public class MainController {
    public static void main(String[] args) {
        Circle c1 = new Circle(5, "red", true);
        System.out.println(c1.toString());

        System.out.println(c1.getArea());
        System.out.println(c1.getColor());

        Shape rec1 = new Rectangle(10, 5, "blue", false);
        System.out.println(rec1.toString());


        Square square1 = new Square(5.0);
        System.out.println(square1.getArea());
    }
}
