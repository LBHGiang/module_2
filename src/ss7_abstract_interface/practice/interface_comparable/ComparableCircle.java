package ss7_abstract_interface.practice.interface_comparable;

public class ComparableCircle extends
        ss6_inheritance.practice.system_geometric_objects.model.Circle
        implements Comparable<ComparableCircle> {

    //constructor
    public ComparableCircle() {
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    public ComparableCircle(double radius) {
        super(radius);
    }


    @Override
    public int compareTo(ComparableCircle circle) {
        if (getRadius() >= circle.getRadius()) {
            return 1;
        }
        return -1;
    }

}
