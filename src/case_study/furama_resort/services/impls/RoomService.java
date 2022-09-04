package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.utils.get_info.GetInFo;

import java.util.List;
import java.util.Scanner;

public class RoomService {
    private static final Scanner scanner = new Scanner(System.in);
    private final MaintainService maintainService = new MaintainService();

    private List<Room> roomList;

    public void addNewRoom() {
        roomList = FacilityService.readFacilityFile.readRoomFile();
        System.out.println("Please enter the following information:");

        String serviceId = getAndCheckRoomId(roomList);
        roomList.add(new Room(
                serviceId,
                FacilityService.getServiceName(),
                FacilityService.getUsableArea(),
                FacilityService.getCost(),
                FacilityService.getMaxPeople(),
                FacilityService.getRentalType(),
                getFreeService()));
        System.out.println("Added new villa successfully!");
        FacilityService.writeFacilityFile.writeRoomFile(roomList);
        maintainService.addNewObject(serviceId);
    }

    public String getAndCheckRoomId(List<Room> list) {
        final String SERVICE_ID_REGEX = "^\\d{4}$";
        while (true) {
            String id = GetInFo.getStringInfo("Room Id: SVRO-", SERVICE_ID_REGEX,
                    "Room Id in the format SVRO-YYYY. Y is number.");
            try {
                for (Room room : list
                ) {
                    if (room.getServiceId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return "SVRO" + id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getFreeService() {
        int choice = GetInFo.takeChoice("Free service: ", Room.FREE_SERVICE);
        return Room.FREE_SERVICE[choice - 1];
    }

    public void editStatus(Facility facility) {
        roomList = FacilityService.readFacilityFile.readRoomFile();
        for (Facility fac : roomList
        ) {
            if (fac.getServiceId().equals(facility.getServiceId())) {
                fac.turnOffActiveMode();
            }

        }
        FacilityService.writeFacilityFile.writeRoomFile(roomList);
    }
}
