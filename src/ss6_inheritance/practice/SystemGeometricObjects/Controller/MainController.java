package ss6_inheritance.practice.SystemGeometricObjects.Controller;

import ss6_inheritance.practice.SystemGeometricObjects.Model.Circle;
import ss6_inheritance.practice.SystemGeometricObjects.Model.Rectangle;
import ss6_inheritance.practice.SystemGeometricObjects.Model.Shape;

public class MainController {
    public static void main(String[] args) {
        Circle c1 = new Circle(5,"red",true);
        System.out.println(c1.toString());

        System.out.println(c1.getArea());
        System.out.println(c1.getColor());

        Shape rec1= new Rectangle(10,5,"blue",false);
        System.out.println(rec1.toString());

        Rectangle rec2 = (Rectangle) rec1;
        System.out.println(rec2.getArea());

    }
}