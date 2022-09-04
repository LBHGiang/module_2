package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.House;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.models.Villa;
import case_study.furama_resort.services.IFacilityService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadFacilityFile;
import case_study.furama_resort.utils.read_and_write.WriteFacilityFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ReadFacilityFile readFacilityFile = new ReadFacilityFile();
    public static final WriteFacilityFile writeFacilityFile = new WriteFacilityFile();
    private final VillaService villaService = new VillaService();
    private final HouseService houseService = new HouseService();
    private final RoomService roomService = new RoomService();

    private static List<Facility> facilityList;
    private static List<Villa> villaList;
    private static List<House> houseList;
    private static List<Room> roomList;

    @Override
    public void displayList() {
        facilityList = getFacilityList();

        if (facilityList.size() == 0) {
            System.out.println("Empty Facility list!");
            return;
        }
        System.out.println("----------Facility List----------");
        for (Facility facility : facilityList
        ) {
            System.out.println(facility.toString());
        }
    }

    @Override
    public void addNewObject() {
        String[] addNewFacilityOptions = {"Add New Villa", "Add New House", "Add New Room", "Return"};
        int choose = GetInFo.takeChoice("Select the Facility to add: ", addNewFacilityOptions);
        switch (choose) {
            case 1:
                villaService.addNewVilla();
                break;
            case 2:
                houseService.addNewHouse();
                break;
            case 3:
                roomService.addNewRoom();
                break;
            case 4:
                return;
            default:
                System.out.println("Your choice is not correct!");
        }
    }

    public static double getUsableArea() {
        return GetInFo.getDoubleNumber("Usable Area: ", 30, 10000);
    }

    public static double getCost() {
        return GetInFo.getDoubleNumber("Rental Cost($): ", 0, 10000);
    }

    public static int getMaxPeople() {
        return GetInFo.getIntegerNumber("Max People: ", 0, 20);
    }

    public static String getRentalType() {
        int choice = GetInFo.takeChoice("Rental Type: ", Facility.RENTAL_TYPE);
        return Facility.RENTAL_TYPE[choice - 1];
    }

    public static String getStandard() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";
        return GetInFo.getStringInfo("Standard: ", NAME_REGEX,
                "The Service name cannot contain numbers and special characters.",
                5, 10,
                "Length of name must be from 5 to 50 characters long");

    }

    public static String getServiceName() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";
        return GetInFo.getStringInfo("Service Name: ", NAME_REGEX,
                "The Service name cannot contain numbers and special characters.",
                5, 10,
                "Length of name must be from 5 to 50 characters long");
    }

    public static List<Facility> getFacilityList() {
        List<Facility> facilityList = new ArrayList<>();
        facilityList.addAll(readFacilityFile.readVillaFile());
        facilityList.addAll(readFacilityFile.readHouseFile());
        facilityList.addAll(readFacilityFile.readRoomFile());
        return facilityList;
    }

    public static Facility findFacility(String ServiceId) {
        facilityList = getFacilityList();

        for (Facility facility : facilityList
        ) {
            if (facility.getServiceId().equals(ServiceId)) {
                return facility;
            }
        }
        return null;
    }

    public void editFacilityStatus(Facility facility) {
        if (facility instanceof Room) {
            roomService.editStatus(facility);
        } else if (facility instanceof House) {
            houseService.editStatus(facility);
        } else {
            villaService.editStatus(facility);
        }
    }

}
