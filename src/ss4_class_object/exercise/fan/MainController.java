package ss4_class_object.exercise.fan;

public class MainController {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setColor("Yellow");
        fan1.setOn();

        Fan fan2 = new Fan();
        fan2.setSpeed(2);
        fan2.setRadius(5);
        fan2.setColor("Blue");
        fan2.setOn();

        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }

}
