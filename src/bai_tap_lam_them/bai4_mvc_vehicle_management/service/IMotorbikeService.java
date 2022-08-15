package bai_tap_lam_them.bai4_mvc_vehicle_management.service;

import bai_tap_lam_them.bai4_mvc_vehicle_management.model.Motorbike;

public interface IMotorbikeService {
    void addNewMotorbike();

    void displayAllMotorbike();

    void findMotorbike(String licensePlate);

    Motorbike findMotorbikeToRemove(String licensePlate);

    void removeMotorbike(Motorbike motorbike);
}
