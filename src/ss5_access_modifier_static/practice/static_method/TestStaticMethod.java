package ss5_access_modifier_static.practice.static_method;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.changeCollege();

        Student student1 = new Student(90, "Giang");
        student1.display();

    }
}
