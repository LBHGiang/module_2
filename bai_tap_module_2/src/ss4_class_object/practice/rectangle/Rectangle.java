package ss4_class_object.practice.rectangle;

public class Rectangle {


    double height;
    double width;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return 2 * (this.height + this.width);
    }

    public String display() {
        return "Rectangle{ width = " + this.width + " height = " + this.height + "}";
    }


}
