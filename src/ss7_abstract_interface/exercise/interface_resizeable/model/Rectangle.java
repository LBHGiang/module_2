package ss7_abstract_interface.exercise.interface_resizeable.model;

public class Rectangle extends Shape implements Resizeable{
    private double width = 1;
    private double length = 1;

    //constructor
    public Rectangle() {
        this.width = 1.0;
        this.length = 1.0;
    }


    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    //getter setter method

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //get area and perimeter

    public double getArea() {
        return this.width * this.length;
    }

    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        if (isFilled()) {
            return String.format("A rectangle with color of %s, filled and length = %f, width = %f ",
                    getColor(), this.length, this.width);
        }
        return String.format("A rectangle with color of %s, not filled and length = %f, width = %f ",
                getColor(), this.length, this.width);
    }

    @Override
    public void resize(double percent) {
        this.width *= 1+percent/100;
        this.length *= 1+percent/100;
    }
}