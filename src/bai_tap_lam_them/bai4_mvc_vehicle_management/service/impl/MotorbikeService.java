package bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl;

import bai_tap_lam_them.bai4_mvc_vehicle_management.controller.VehicleController;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Manufacturer;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Motorbike;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.IMotorbikeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeService implements IMotorbikeService {
    private static List<Motorbike> motorbikes = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private ManufacturerService manufacturerService = new ManufacturerService();

    static {
        motorbikes.add(new Motorbike("75K3333", ManufacturerService.manufacturers.get(1), 2000, "Tiến", 10));
        motorbikes.add(new Motorbike("78K2222", ManufacturerService.manufacturers.get(3), 2006, "Vinh", 10));
    }

    @Override
    public void addNewMotorbike() {
        motorbikes.add(getMotorbikeInfo());
        System.out.println("Thêm xe máy thành công!");
    }

    @Override
    public void displayAllMotorbike() {
        System.out.println("------------------");
        System.out.println("Danh sách xe máy");
        for (Motorbike motorbike :
                motorbikes) {
            System.out.println(motorbike.toString());
        }
    }

    @Override
    public void findMotorbike(String licensePlate) {
        for (Motorbike motorbike :
                motorbikes) {
            if (motorbike.getLicensePlate().contains(licensePlate)) {
                System.out.println(motorbike.toString());
                VehicleController.foundVehicle = true;
            }
        }
    }

    @Override
    public Motorbike findMotorbikeToRemove(String licensePlate) {
        for (Motorbike motorbike :
                motorbikes) {
            if (motorbike.getLicensePlate().equals(licensePlate)) {
                return motorbike;
            }
        }
        return null;
    }

    @Override
    public void removeMotorbike(Motorbike motorbike) {
        motorbikes.remove(motorbike);
    }

    public Motorbike getMotorbikeInfo() {

        System.out.println("----------------");
        System.out.println("Vui lòng nhập thông tin cho xe máy:");
        System.out.print("Nhập biển kiểm soát: ");
        String licensePlate = scanner.nextLine();

        manufacturerService.displayAllManufacturer();
        System.out.print("Chọn hãng sản xuất: ");
        Manufacturer manufacturer;
        boolean checkNull;
        do {
            int choose = Integer.parseInt(scanner.nextLine());

            manufacturer = manufacturerService.chooseManufacturer(choose);
            checkNull = manufacturer == null;
            if (checkNull) {
                System.out.print("Dữ liệu không hợp lệ, mời bạn chọn lại: ");
            }
        } while (checkNull);

        System.out.print("Nhập năm sản xuất: ");
        int year = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập tên chủ sở hữu: ");
        String owner = scanner.nextLine();

        System.out.print("Nhập công suất: ");
        int capacity = Integer.parseInt(scanner.nextLine());

        return new Motorbike(licensePlate, manufacturer, year, owner, capacity);
    }
}
