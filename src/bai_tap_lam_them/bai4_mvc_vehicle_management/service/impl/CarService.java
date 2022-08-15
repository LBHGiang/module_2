package bai_tap_lam_them.bai4_mvc_vehicle_management.service.impl;

import bai_tap_lam_them.bai4_mvc_vehicle_management.controller.VehicleController;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Car;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Manufacturer;
import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Truck;
import bai_tap_lam_them.bai4_mvc_vehicle_management.service.ICarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarService implements ICarService {
    private Scanner scanner = new Scanner(System.in);
    private ManufacturerService manufacturerService = new ManufacturerService();
    private static List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("73K1111", ManufacturerService.manufacturers.get(0), 2000, "Giang", "xe khách", 4));
        cars.add(new Car("73K2222", ManufacturerService.manufacturers.get(1), 2022, "Hải", "xe du lịch", 16));
    }

    @Override
    public void addNewCar() {
        cars.add(getCarInfo());
        System.out.println("Thêm xe ô tô thành công!");
    }

    @Override
    public void displayAllCar() {
        System.out.println("------------------");
        System.out.println("Danh sách xe ô tô");
        for (Car car :
                cars) {
            System.out.println(car.toString());
        }
    }

    @Override
    public void findCar(String licensePlate) {
        for (Car car :
                cars) {
            if (car.getLicensePlate().contains(licensePlate)) {
                System.out.println(car.toString());
                VehicleController.foundVehicle = true;
            }
        }
    }

    @Override
    public Car findCarToRemove(String licensePlate) {
        for (Car car :
                cars) {
            if (car.getLicensePlate().equals(licensePlate)) {
                return car;
            }
        }
        return null;
    }

    @Override
    public void removeCar(Car car) {
        cars.remove(car);
    }

    public Car getCarInfo() {

        System.out.println("----------------");
        System.out.println("Vui lòng nhập thông tin cho xe ô tô:");
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

        System.out.print("Nhập kiểu xe: ");
        String model = scanner.nextLine();

        System.out.print("Nhập chỗ ngồi: ");
        int numberOfSeats = Integer.parseInt(scanner.nextLine());

        return new Car(licensePlate, manufacturer, year, owner, model, numberOfSeats);
    }
}
