package ss4_class_object.exercise.quadratic_equation;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return this.c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getDelta() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public double getRoot1() {
        return ((-this.b + Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / 2 / this.a);
    }

    public double getRoot2() {
        return ((-this.b - Math.pow(Math.pow(this.b, 2) - 4 * this.a * this.c, 0.5)) / 2 / this.a);
    }


}
