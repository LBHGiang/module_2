package ss5_access_modifier_static.exercise.write_only;

public class TestAccessModifier {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.setClasses("C00001");
        student1.setName("Giang");
        System.out.println(student1.toString());


    }
}
