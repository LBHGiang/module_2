package ss5_access_modifier_static.exercise.write_only;

public class Student {
    private String name = "Nguyen Van A";
    private String classes = "C06";

    //Constructor
    Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
