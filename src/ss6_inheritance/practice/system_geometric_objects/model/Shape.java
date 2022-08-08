package ss6_inheritance.practice.system_geometric_objects.model;

public class Shape {
    private String color = "";
    private boolean filled = false;

    //constructor
    public Shape() {
        this.color = "green";
        this.filled = true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    //setter, getter method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
            return "A Shape with color of " + this.color + (isFilled()? " and filled.":" and not filled.");
    }
}
