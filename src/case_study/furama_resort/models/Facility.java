package case_study.furama_resort.models;

public abstract class Facility {
    private String serviceId;
    private String serviceName;
    private double area;
    private double cost;
    private int maxPerson;
    private String rentalType;
    private int TimeUsed;

    public Facility() {
    }

    public Facility(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, int timeUsed) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.area = area;
        this.cost = cost;
        this.maxPerson = maxPerson;
        this.rentalType = rentalType;
        TimeUsed = timeUsed;
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

    public int getTimeUsed() {
        return TimeUsed;
    }

    public void setTimeUsed(int timeUsed) {
        TimeUsed = timeUsed;
    }

    @Override
    public String toString() {
        return "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", cost=" + cost +
                ", maxPerson=" + maxPerson +
                ", rentalType='" + rentalType + '\'' +
                ", TimeUsed=" + TimeUsed +
                '}';
    }
}
