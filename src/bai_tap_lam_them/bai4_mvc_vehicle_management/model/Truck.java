package bai_tap_lam_them.bai4_mvc_vehicle_management.model;

public class Truck extends Vehicle {
    private int load;
    private final String UNIT_OF_LOAD = " tons";

    public Truck() {
    }

    public Truck(int load) {
        this.load = load;
    }

    public Truck(String licensePlate, Manufacturer manufacturer, int year, String owner, int load) {
        super(licensePlate, manufacturer, year, owner);
        this.load = load;
    }

    public int getLoad() {
        return load;
    }

    public void setLoad(int load) {
        this.load = load;
    }

    @Override
    public String toString() {
        return "Truck: " + super.toString() +
                " load= " + load + UNIT_OF_LOAD;
    }
}
