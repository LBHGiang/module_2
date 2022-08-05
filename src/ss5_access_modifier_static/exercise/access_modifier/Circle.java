package ss5_access_modifier_static.exercise.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    //constructor
    Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }


    public double getRadius() {
        return this.radius;
    }

    public double getAria(){
        return  Math.pow(this.radius,2)*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color +
                "', area='" + getAria() +
                "'}";
    }
}

