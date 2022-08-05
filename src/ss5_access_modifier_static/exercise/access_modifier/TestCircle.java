package ss5_access_modifier_static.exercise.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(3.0, "Blue");

        System.out.println(circle1.toString());
        System.out.println(circle2.toString());

    }
}
