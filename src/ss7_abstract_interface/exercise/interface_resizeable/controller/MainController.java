package ss7_abstract_interface.exercise.interface_resizeable.controller;

import ss7_abstract_interface.exercise.interface_resizeable.model.Circle;
import ss7_abstract_interface.exercise.interface_resizeable.model.Rectangle;
import ss7_abstract_interface.exercise.interface_resizeable.model.Square;

public class MainController {
    public static void main(String[] args) {

        Circle circle = new Circle(10.0);
        Rectangle rectangle = new Rectangle(5, 10);
        Square square = new Square(10);


        //before resize
        System.out.println("Before resize");
        System.out.println("Circle Area = " + circle.getArea());
        System.out.println("Rectangle Area = " + rectangle.getArea());
        System.out.println("Square Area = " + square.getArea());


        // after resize
        System.out.println("After resize");

        double percent = Math.floor(Math.random() * 100 + 1);
        circle.resize(percent);
        System.out.println("Percent = " + percent +
                " , Circle Area = " + circle.getArea());

        percent = Math.floor(Math.random() * 100 + 1);
        rectangle.resize(percent);
        System.out.println("Percent = " + percent +
                " , Rectangle Area = " + rectangle.getArea());

        percent = Math.floor(Math.random() * 100 + 1);
        square.resize(percent);
        System.out.println("Percent = " + percent +
                " , square Area = " + square.getArea());

    }

}
