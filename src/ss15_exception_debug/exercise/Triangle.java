package ss15_exception_debug.exercise;

import ss6_inheritance.practice.system_geometric_objects.model.Shape;

public class Triangle extends Shape {
    private double side1 = 0;
    private double side2 = 0;
    private double side3 = 0;

    //constructor

    public Triangle() {
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    //getter setter method

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double[] getSide() {
        return new double[]{this.side1, this.side2, this.side3};
    }

    public void setSide(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    //get area and perimeter

    public double getPerimeter() {
        return this.side1 + this.side2 + this.side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public String toString() {
        return String.format("Triangle: (%.2f,%.2f,%.2f). Perimeter = %.2f, Area = %.2f."
                , this.side1, this.side2, this.side3, getPerimeter(), getArea());

    }
}
