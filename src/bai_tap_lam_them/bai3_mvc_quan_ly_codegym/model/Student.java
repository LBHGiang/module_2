package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model;

public class Student extends Person {
    private double score;
    private String className;

    public Student() {
    }

    public Student(double score, String className) {
        this.score = score;
        this.className = className;
    }

    public Student(String id, String name, String dateOfBirth, String gender, double score, String className) {
        super(id, name, dateOfBirth, gender);
        this.score = score;
        this.className = className;
    }

    public Student(String id, String name, double score, String className) {
        super(id, name);
        this.score = score;
        this.className = className;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }


    @Override
    public String toString() {
        return "Student{" + super.toString() +
                " ,score=" + score +
                ", className='" + className + '\'' +
                '}';
    }

    @Override
    public String toStringOfFile() {
        return String.format("%s,%s,%s", super.toStringOfFile(), score, className);
    }
}


