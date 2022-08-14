package bai_tap_lam_them.bai4_mvc_vehicle_management.model;

public class Car extends Vehicle {

    private String model;
    private int numberOfSeats;

    public Car() {
    }

    public Car(String model, int numberOfSeats) {
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public Car(String licensePlate, Manufacturer manufacturer, int year, String owner, String model, int numberOfSeats) {
        super(licensePlate, manufacturer, year, owner);
        this.model = model;
        this.numberOfSeats = numberOfSeats;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    @Override
    public String toString() {
        return "Car: " + super.toString() +
                " model='" + model + '\'' +
                ", numberOfSeats= " + numberOfSeats;
    }
}
