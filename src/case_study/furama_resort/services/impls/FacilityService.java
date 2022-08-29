package case_study.furama_resort.services.impls;

import case_study.furama_resort.models.*;
import case_study.furama_resort.services.IFacilityService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadFacilityFile;
import case_study.furama_resort.utils.read_and_write.WriteFacilityFile;

import java.util.List;
import java.util.Scanner;

public class FacilityService implements IFacilityService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final ReadFacilityFile readFacilityFile = new ReadFacilityFile();
    private static final WriteFacilityFile writeFacilityFile = new WriteFacilityFile();

    private static List<Villa> villaList;
    private static List<House> houseList;
    private static List<Room> roomList;
    private static List<Facility> facilityList;


    @Override
    public void displayList() {
        facilityList.addAll(readFacilityFile.readVillaFile());
        facilityList.addAll(readFacilityFile.readHouseFile());
        facilityList.addAll(readFacilityFile.readRoomFile());

        if (facilityList.size() == 0) {
            System.out.println("Empty list!");
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
                addNewVilla();
                break;
            case 2:
                addNewHouse();
                break;
            case 3:
                addNewRoom();
                break;
            case 4:
                return;
            default:
                System.out.println("Your choice is not correct!");
        }
    }

    private void addNewRoom() {
    }

    private void addNewHouse() {
    }

    private void addNewVilla() {
        villaList = readFacilityFile.readVillaFile();
        System.out.println("Please enter the following information:");

        villaList.add(new Villa(



        ));


        System.out.println("Added new villa successfully!");
        writeFacilityFile.writeVillaFile(villaList);
        displayList();
    }


    @Override
    public void displayMaintenanceList() {

    }




}
