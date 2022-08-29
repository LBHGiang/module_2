package case_study.furama_resort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, String freeService) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType);
        this.freeService = freeService;
    }

    public Room(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, boolean isMaintaining, String freeService) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType, isMaintaining);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{ " + super.toString() +
                " freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String toFileString() {
        return String.format("%s,%s", super.toFileString(), freeService);
    }
}
