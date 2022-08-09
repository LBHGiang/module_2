package ss7_abstract_interface.exercise.interface_resizeable.model;

public class Circle extends Shape implements Resizeable{
    private double radius;

    //constructor
    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    //getter and setter method

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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
        if (isFilled()) {
            return String.format("A circle with color of %s, filled and radius = %f",
                    getColor(), this.radius);
        }
        return String.format("A circle with color of %s, not filled and radius = %.2f",
                getColor(), this.radius);
    }

    @Override
    public void resize(double percent) {
        this.radius *= 1+percent/100;
    }


}