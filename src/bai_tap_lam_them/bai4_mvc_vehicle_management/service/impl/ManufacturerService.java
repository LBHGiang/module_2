package bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl;

import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Manufacturer;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.IManufacturerService;

import java.util.ArrayList;
import java.util.List;

public class ManufacturerService implements IManufacturerService {
    public static List<Manufacturer> manufacturers = new ArrayList<>();

    static {
        manufacturers.add(new Manufacturer("A01", "Mec", "Đức"));
        manufacturers.add(new Manufacturer("B02", "Toyota", "Nhật"));
        manufacturers.add(new Manufacturer("C03", "Vinfast", "Việt"));
        manufacturers.add(new Manufacturer("D04", "Audi", "Đức"));
    }


    @Override
    public void addNewManufacturer() {

    }

    @Override
    public void removeManufacturer() {

    }

    @Override
    public void editManufacturer() {

    }

    @Override
    public void findManufacturerByName() {

    }

    @Override
    public void displayAllManufacturer() {
        System.out.println("------------------");
        System.out.println("Danh sách hãng sản xuất");
        for (int i = 0; i < manufacturers.size(); i++) {
            System.out.println((i + 1) + ". " + manufacturers.get(i).toString());
        }
    }

    public Manufacturer chooseManufacturer(int choose) {
        if (choose < 1 || choose > manufacturers.size()) {
            return null;
        }
        return manufacturers.get(choose - 1);
    }

}
