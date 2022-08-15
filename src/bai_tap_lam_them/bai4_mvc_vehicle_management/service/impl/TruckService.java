package bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl;

import bai_tap_lam_them.bai4_mvc_vehicle_management.controller.VehicleController;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Manufacturer;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Truck;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.ITruckService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckService implements ITruckService {
    private static List<Truck> trucks = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private ManufacturerService manufacturerService = new ManufacturerService();

    static {
        trucks.add(new Truck("74K1111", ManufacturerService.manufacturers.get(2), 2011, "Trường", 16));
        trucks.add(new Truck("75K2222", ManufacturerService.manufacturers.get(3), 2016, "Hoàng", 28));
    }

    @Override
    public void addNewTruck() {
        trucks.add(getTruckInfo());
        System.out.println("Thêm xe tải thành công!");
    }

    @Override
    public void displayAllTruck() {
        System.out.println("------------------");
        System.out.println("Danh sách xe tải");
        for (Truck truck :
                trucks) {
            System.out.println(truck.toString());
        }
    }

    @Override
    public void findTruck(String licensePlate) {
        for (Truck truck :
                trucks) {
            if (truck.getLicensePlate().contains(licensePlate)) {
                System.out.println(truck.toString());
                VehicleController.foundVehicle = true;
            }
        }
    }

    @Override
    public void removeTruck(Truck truck) {
        trucks.remove(truck);
    }

    @Override
    public Truck findTruckToRemove(String licensePlate) {
        for (Truck truck :
                trucks) {
            if (truck.getLicensePlate().equals(licensePlate)) {
                return truck;
            }
        }
        return null;
    }

    public Truck getTruckInfo() {

        System.out.println("----------------");
        System.out.println("Vui lòng nhập thông tin cho xe tải:");
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

        System.out.print("Nhập tải trọng: ");
        int load = Integer.parseInt(scanner.nextLine());

        return new Truck(licensePlate, manufacturer, year, owner, load);
    }
}
