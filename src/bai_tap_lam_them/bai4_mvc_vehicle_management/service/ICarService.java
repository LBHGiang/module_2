package bai_tap_lam_them.bai4_mvc_vehicle_management.service;

import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Car;

public interface ICarService {
    void addNewCar();

    void displayAllCar();

    void findCar(String licensePlate);

    Car findCarToRemove(String licensePlate);

    void removeCar(Car car);
}
