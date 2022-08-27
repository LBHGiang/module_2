package case_study.furama_resort.models;

public class House extends Facility {
    private String standard;
    private int floors;

    public House() {
    }

    public House(String standard, int floors) {
        this.standard = standard;
        this.floors = floors;
    }

    public House(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, int timeUsed, String standard, int floors) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType, timeUsed);
        this.standard = standard;
        this.floors = floors;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public String toString() {
        return "House{ " + super.toString() +
                ", standard='" + standard + '\'' +
                ", floors=" + floors +
                '}';
    }
}
