package case_study.furama_resort.models;

public class Villa extends Facility {
    private String standard;
    private double poolArea;
    private int floors;

    public Villa() {
    }

    public Villa(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, int timeUsed, String standard, double poolArea, int floors) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType, timeUsed);
        this.standard = standard;
        this.poolArea = poolArea;
        this.floors = floors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "Villa{ " + super.toString() +
                " standard='" + standard + '\'' +
                ", poolArea=" + poolArea +
                ", floors=" + floors +
                '}';
    }
}
