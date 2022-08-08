package ss6_inheritance.exercise.point2D_and_point3D.controller;

import ss6_inheritance.exercise.point2D_and_point3D.model.Point2D;
import ss6_inheritance.exercise.point2D_and_point3D.model.Point3D;

public class MainController {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3, 5);
        System.out.println(point2D);

        Point3D point3D = new Point3D(3, 5, 7);
        System.out.println(point3D);


    }
}
