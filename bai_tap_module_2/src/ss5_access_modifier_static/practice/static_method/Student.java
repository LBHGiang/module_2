package ss5_access_modifier_static.practice.static_method;

public class Student {
    private int phoneNumber;
    private String name;
    private static String college = "CodeGym";

    //constructor
    Student(int phoneNumber, String name) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    Student() {
    }

    static void changeCollege() {
        college = "C0622G1";
    }


    void display() {
        System.out.printf("Student:%s, phone: %d, college: %s ",
                this.name, this.phoneNumber, Student.college);
    }

}
