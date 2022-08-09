package ss7_abstract_interface.exercise.interface_resizeable.model;

public class Square extends Rectangle implements Resizeable {
    //constructor
    public Square(double side) {
        super(side, side);
    }

    public Square() {
        super(1.0, 1.0);
    }

    public double getSide() {
        return getWidth();
    }

    public void set(double side) {
        setWidth(side);
        setLength(side);
    }

    public String toString() {
        if (isFilled()) {
            return String.format("A Square with color of %s, filled and side = %f ",
                    getColor(), getSide());
        }
        return String.format("A Square with color of %s, not filled and side = %f ",
                getColor(), getSide());
    }

    @Override
    public void resize(double percent) {
        set(getSide() * (1 + percent / 100));
    }
}
