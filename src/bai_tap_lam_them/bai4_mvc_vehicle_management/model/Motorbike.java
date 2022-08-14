package bai_tap_lam_them.bai4_mvc_vehicle_management.model;

public class Motorbike extends Vehicle {
    private int capacity;
    private final String UNIT_OF_CAPACITY = " kW";

    public Motorbike() {
    }

    public Motorbike(int capacity) {
        this.capacity = capacity;
    }

    public Motorbike(String licensePlate, Manufacturer manufacturer, int year, String owner, int capacity) {
        super(licensePlate, manufacturer, year, owner);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Motorbike: " + super.toString() +
                " capacity= " + capacity + UNIT_OF_CAPACITY;
    }
}
