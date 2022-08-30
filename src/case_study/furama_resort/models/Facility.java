package case_study.furama_resort.models;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double area;
    private double cost;
    private int maxPerson;
    private String rentalType;
    private boolean isMaintaining = false;
    public static final String[] RENTAL_TYPE = {"Year", "Month", "Hour"};

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, boolean isMaintaining) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
        this.isMaintaining = isMaintaining;
    }

    public Facility(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
    }

    public String getStatus() {
        return isMaintaining ? "Active" : "Maintaining";
    }

    public void turnOnActiveMode() {
        isMaintaining = false;
    }

    public void turnOffActiveMode() {
        isMaintaining = true;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(int maxPerson) {
        this.maxPerson = maxPerson;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'' +
                ", status='" + getStatus() + '\'';
    }

    public String toFileString() {
        return String.format("%s,%s,%s,%s,%s,%s,%s", serviceId, serviceName, area, cost, maxPerson, rentalType, isMaintaining);
    }
}
