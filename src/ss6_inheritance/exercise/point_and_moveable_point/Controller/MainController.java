package ss6_inheritance.exercise.point_and_moveable_point.Controller;

import ss6_inheritance.exercise.point_and_moveable_point.Model.MoveablePoint;

public class MainController {
    public static void main(String[] args) {
        MoveablePoint moveablePoint1 = new MoveablePoint(1, 1, 10, 10);
        System.out.println(moveablePoint1);
        System.out.println(moveablePoint1.move());
        System.out.println(moveablePoint1.move());
    }

}
