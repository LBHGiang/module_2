package bai_tap_lam_them.bai4_mvc_vehicle_management.model;

public abstract class Vehicle {
    private String licensePlate;
    public Manufacturer manufacturer;
    private int year;
    private String owner;

    public Vehicle() {
    }

    public Vehicle(String licensePlate, Manufacturer manufacturer, int year, String owner) {
        this.licensePlate = licensePlate;
        this.manufacturer = manufacturer;
        this.year = year;
        this.owner = owner;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "licensePlate='" + licensePlate + '\'' +
                ", manufacturer='" + manufacturer.getName() + '\'' +
                ", owner='" + owner + '\'' +
                ", year=" + year;
    }
}
