package bai_tap_lam_them.bai4_mvc_vehicle_management.controller;

import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Car;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Motorbike;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Truck;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.ICarService;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.IMotorbikeService;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.ITruckService;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl.CarService;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl.MotorbikeService;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl.TruckService;

import java.util.Scanner;

public class VehicleController {
    private Scanner scanner = new Scanner(System.in);
    private int choose;
    public static boolean foundVehicle;

    private ITruckService iTruckService = new TruckService();
    private ICarService iCarService = new CarService();
    private IMotorbikeService iMotorbikeService = new MotorbikeService();

    public void menuManagement() {
        while (true) {
            System.out.println("----------------");
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG");
            System.out.println("1. Thêm mới phương tiện.");
            System.out.println("2. Hiển thị phương tiện");
            System.out.println("3. Xóa phương tiện");
            System.out.println("4. Tìm kiếm theo biển kiểm soát");
            System.out.println("5. Thoát");
            System.out.println("Mời bạn chọn chức năng: 1->5");
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    addNewVehicle();
                    break;
                case 2:
                    displayVehicle();
                    break;
                case 3:
                    removeVehicle();
                    break;
                case 4:
                    findVehicle();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn bạn nhập không đúng");
            }

        }
    }

    private void addNewVehicle() {
        System.out.println("----------------");
        System.out.println("Thêm mới phương tiện giao thông: ");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ô tô");
        System.out.println("3. Thêm xe máy");
        System.out.println("4. Trở lại menu trước");
        System.out.println("5. Thoát");
        System.out.println("Mời bạn chọn chức năng: 1->5");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                iTruckService.addNewTruck();
                break;
            case 2:
                iCarService.addNewCar();
                break;
            case 3:
                iMotorbikeService.addNewMotorbike();
                break;
            case 4:
                return;
            case 5:
                System.exit(0);
            default:
                System.out.println("Lựa chọn bạn nhập không đúng");
        }
    }

    private void displayVehicle() {
        System.out.println("----------------");
        System.out.println("Hiển thị phương tiện giao thông: ");
        System.out.println("1. Hiển thị xe tải");
        System.out.println("2. Hiển thị ô tô");
        System.out.println("3. Hiển thị xe máy");
        System.out.println("4. Trở lại menu trước");
        System.out.println("5. Thoát");
        System.out.println("Mời bạn chọn chức năng: 1->5");
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                iTruckService.displayAllTruck();
                break;
            case 2:
                iCarService.displayAllCar();
                break;
            case 3:
                iMotorbikeService.displayAllMotorbike();
                break;
            case 4:
                return;
            case 5:
                System.exit(0);
            default:
                System.out.println("Lựa chọn bạn nhập không đúng");
        }
    }

    private void removeVehicle() {
        System.out.println("----------------");
        System.out.println("Vui lòng nhập chính xác biển kiểm soát của phương tiện cần xóa: ");
        String licensePlate = scanner.nextLine();
        Truck truck = iTruckService.findTruckToRemove(licensePlate);
        Car car = iCarService.findCarToRemove(licensePlate);
        Motorbike motorbike = iMotorbikeService.findMotorbikeToRemove(licensePlate);
        if (truck != null || car != null || motorbike != null) {
            System.out.println("Bạn chắc chắn xóa phương tiện này chứ: ");
            System.out.println("1- Có ------------  2- Hủy bỏ");
            choose = Integer.parseInt(scanner.nextLine());
            if (choose == 1) {
                if (truck != null) {
                    iTruckService.removeTruck(truck);
                }
                if (car != null) {
                    iCarService.removeCar(car);
                }
                iMotorbikeService.removeMotorbike(motorbike);
            }
            System.out.println("Xóa phương tiện thành công!");
        }
    }

    private void findVehicle() {
        foundVehicle = false;
        System.out.println("----------------");
        System.out.println("Mời bạn nhập biểm kiểm soát của phương tiện: ");
        String licensePlate = scanner.nextLine();
        System.out.println("Kết quả tìm kiếm: ");
        iTruckService.findTruck(licensePlate);
        iCarService.findCar(licensePlate);
        iMotorbikeService.findMotorbike(licensePlate);
        if (!foundVehicle) {
            System.out.println("Không tìm thấy phương tiện này.");
        }
    }
}