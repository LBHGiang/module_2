package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.Villa;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadFacilityFile;
import case_study.furama_resort.utils.read_and_write.WriteFacilityFile;

import java.util.List;
import java.util.Scanner;

public class VillaService {
    private static final Scanner scanner = new Scanner(System.in);
    private final MaintainService maintainService = new MaintainService();

    private List<Villa> villaList;

    public void addNewVilla() {
        villaList = FacilityService.readFacilityFile.readVillaFile();
        System.out.println("Please enter the following information:");

        String serviceId = getAndCheckVillaId(villaList);
        villaList.add(new Villa(
                serviceId,
                FacilityService.getServiceName(),
                FacilityService.getUsableArea(),
                FacilityService.getCost(),
                FacilityService.getMaxPeople(),
                FacilityService.getRentalType(),
                getVillaStandard(),
                getPoolArea(),
                getFloors()));
        System.out.println("Added new villa successfully!");
        FacilityService.writeFacilityFile.writeVillaFile(villaList);
        maintainService.addNewObject(serviceId);
    }

    public String getAndCheckVillaId(List<Villa> list) {
        final String SERVICE_ID_REGEX = "^\\d{4}$";
        while (true) {
            String id = GetInFo.getStringInfo("Villa Id: SVVL-", SERVICE_ID_REGEX,
                    "Villa Id in the format SVVL-YYYY. Y is number.");
            try {
                for (Villa villa : list
                ) {
                    if (villa.getServiceId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return "SVVL" + id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getVillaStandard() {
        int choice = GetInFo.takeChoice("Villa Standard: ", Villa.VILLA_STANDARD);
        return Villa.VILLA_STANDARD[choice - 1];
    }

    public double getPoolArea() {
        return GetInFo.getDoubleNumber("Pool Area: ", 30, 10000);
    }

    public static int getFloors() {
        return GetInFo.getIntegerNumber("Number of floors: ", 0, 100);
    }


}
