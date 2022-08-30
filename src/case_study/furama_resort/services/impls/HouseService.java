package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.House;
import case_study.furama_resort.utils.get_info.GetInFo;

import java.util.List;
import java.util.Scanner;

public class HouseService {
    private static final Scanner scanner = new Scanner(System.in);
    private final MaintainService maintainService = new MaintainService();

    private List<House> houseList;


    public void addNewHouse() {
        houseList = FacilityService.readFacilityFile.readHouseFile();
        System.out.println("Please enter the following information:");
        String serviceId = getAndCheckHouseId(houseList);
        houseList.add(new House(
                serviceId,
                FacilityService.getServiceName(),
                FacilityService.getUsableArea(),
                FacilityService.getCost(),
                FacilityService.getMaxPeople(),
                FacilityService.getRentalType(),
                getHouseStandard(),
                getFloors()));
        System.out.println("Added new house successfully!");
        FacilityService.writeFacilityFile.writeHouseFile(houseList);
        maintainService.addNewObject(serviceId);

    }


    public String getAndCheckHouseId(List<House> list) {
        final String SERVICE_ID_REGEX = "^\\d{4}$";
        while (true) {
            String id = GetInFo.getStringInfo("House Id: SVHO-", SERVICE_ID_REGEX,
                    "House Id in the format SVHO-YYYY. Y is number.");
            try {
                for (House house : list
                ) {
                    if (house.getServiceId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return "SVHO" + id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }


    public String getHouseStandard() {
        int choice = GetInFo.takeChoice("House Standard: ", House.HOUSE_STANDARD);
        return House.HOUSE_STANDARD[choice - 1];
    }

    public static int getFloors() {
        return GetInFo.getIntegerNumber("Number of floors: ", 0, 100);
    }

}
