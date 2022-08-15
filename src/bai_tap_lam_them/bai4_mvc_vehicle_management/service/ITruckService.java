package bai_tap_lam_them.bai4_mvc_vehicle_management.service;

import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Truck;

public interface ITruckService {
    void addNewTruck();

    void displayAllTruck();

    void findTruck(String licensePlate);

   void removeTruck(Truck truck);

    Truck findTruckToRemove(String licensePlate);
}
