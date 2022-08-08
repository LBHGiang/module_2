package ss6_inheritance.exercise.circle_and_cylinder.model;

public class Cylinder extends Circle {
    private double height;

    //constructor
    public Cylinder() {
        super();
        this.height = 1;
    }

    public Cylinder(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.height * getArea();
    }

    @Override
    public String toString() {
        return String.format("Cylinder: height = %.2f, bottom is %s", this.height, super.toString());

    }
}
