package case_study.furama_resort.services.impls;

import case_study.furama_resort.models.Facility;
import case_study.furama_resort.services.IMaintainService;
import case_study.furama_resort.utils.read_and_write.ReadMaintainFile;
import case_study.furama_resort.utils.read_and_write.WriteMaintainFile;

import java.util.Map;
import java.util.Scanner;

public class MaintainService implements IMaintainService {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ReadMaintainFile readMaintainFile = new ReadMaintainFile();
    public static final WriteMaintainFile writeMaintainFile = new WriteMaintainFile();
    private static Map<String, Integer> maintainList;


    @Override
    public void displayList() {
        maintainList = readMaintainFile.readMaintainFile();
        if (maintainList.size() == 0) {
            System.out.println("Empty Maintain Facility list!");
            return;
        }
        System.out.printf("%-20s%s\n", "Service Id", "Time Used");
        for (Map.Entry<String, Integer> entry : maintainList.entrySet()
        ) {
            System.out.printf("%-20s%s\n", entry.getKey(), entry.getValue());
        }
    }

    @Override
    public void addNewObject(String serviceId) {
        maintainList = readMaintainFile.readMaintainFile();
        Facility facility = FacilityService.findFacility(serviceId);
        if (facility == null) {
            System.out.println("Id does not exist");
            return;
        }
        maintainList.put(facility.getServiceId(), 0);
        writeMaintainFile.writeMaintainFile(maintainList);
    }

    @Override
    public void displayMaintainingFacilities() {
        maintainList = readMaintainFile.readMaintainFile();
        StringBuilder maintainingList = new StringBuilder();

        for (Map.Entry<String, Integer> entry : maintainList.entrySet()
        ) {
            if (entry.getValue() >= 5) {
                maintainingList.append(entry.getKey());
            }
        }
        if (maintainingList.length() == 0) {
            System.out.println("No facilities are under maintenance");
        } else {
            System.out.print("Facilities under maintenance: " + maintainingList);
        }
    }

    @Override
    public void completeMaintenance(String serviceId) {
        maintainList = readMaintainFile.readMaintainFile();
        Facility facility = FacilityService.findFacility(serviceId);
        if (facility == null) {
            System.out.println("Id does not exist");
            return;
        }
        maintainList.put(facility.getServiceId(), 0);
        facility.turnOnActiveMode();
        writeMaintainFile.writeMaintainFile(maintainList);
    }

    @Override
    public void checkMaintain(String serviceId) {
        maintainList = readMaintainFile.readMaintainFile();
        Facility facility = FacilityService.findFacility(serviceId);
        if (facility == null) {
            System.out.println("Id does not exist");
            return;
        }
        maintainList.put(facility.getServiceId(), 0);
        writeMaintainFile.writeMaintainFile(maintainList);
    }


}
