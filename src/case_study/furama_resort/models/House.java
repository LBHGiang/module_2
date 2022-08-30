package case_study.furama_resort.models;

public class House extends Facility {
    private String standard;
    private int floors;
    public static final String[] HOUSE_STANDARD = {"5 Star", "4 Star", "3 Star"};

    public House() {
    }

    public House(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, boolean isMaintaining, String standard, int floors) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType, isMaintaining);
        this.standard = standard;
        this.floors = floors;
    }

    public House(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, String standard, int floors) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType);
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

    @Override
    public String toFileString() {
        return String.format("%s,%s,%s", super.toFileString(), standard, floors);
    }
}
