package ss4_class_object.exercise.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public void setSpeed(int speed) {
        if (speed != 1 && speed != 2 && speed != 3) {
            System.out.println("can't set " + speed + "! Speed must be 1,2 or 3.");
        } else {
            this.speed = speed;
        }
    }

    public void setOn() {
        this.on = true;
    }

    public void setOff() {
        this.on = false;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        if (on) {
            switch (this.speed) {
                case 1:
                    return "SLOW";
                case 2:
                    return "MEDIUM";
                case 3:
                    return "FAST";
            }
        }
        return "Fan is off";
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public boolean isOn() {
        return on;
    }

    //constructor

    public Fan() {
    }

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String toString() {
        if (on) {
            return "Fan is on {" +
                    "speed=" + this.getSpeed() +
                    ", radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        } else {
            return "Fan is off {" +
                    "radius=" + this.radius +
                    ", color='" + this.color + '\'' +
                    '}';
        }
    }
}
