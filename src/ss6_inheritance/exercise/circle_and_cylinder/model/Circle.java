package ss6_inheritance.exercise.circle_and_cylinder.model;

public class Circle {
    private double radius;
    private String color;

    //constructor
    public Circle() {
        this.radius = 1;
        this.color = "";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    //getter and setter method

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //get area and perimeter
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return String.format("A circle with color of %s and radius = %.2f",
                this.color, this.radius);
    }

}
