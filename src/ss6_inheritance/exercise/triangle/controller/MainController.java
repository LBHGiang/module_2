package ss6_inheritance.exercise.triangle.controller;

import ss6_inheritance.exercise.triangle.model.Triangle;

public class MainController {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 4, 3);
        System.out.println(triangle1.getArea());
        System.out.println(triangle1);
    }
}
