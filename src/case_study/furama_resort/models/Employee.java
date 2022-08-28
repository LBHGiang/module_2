package case_study.furama_resort.models;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;
    public static final String[] LEVEL_OPTIONS = {"Intermediate","College","University","After university"};
    public static final String[] POSITION_OPTIONS = {"Receptionist","Service","Expert","Monitoring","Manager","Director"};



    public Employee() {
    }

    public Employee(String id, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String position, double salary) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{ " + super.toString() +
                ", level='" + level + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public String toFileString() {
        return String.format("%s,%s,%s,%s", super.toFileString(), level, position, salary);
    }
}
