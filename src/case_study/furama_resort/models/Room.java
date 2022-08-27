package case_study.furama_resort.models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(String serviceId, String serviceName, double area, double cost, int maxPerson, String rentalType, int timeUsed, String freeService) {
        super(serviceId, serviceName, area, cost, maxPerson, rentalType, timeUsed);
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
}
