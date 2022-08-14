package bai_tap_lam_them.bai4_mvc_vehicle_management.view;

import bai_tap_lam_them.bai4_mvc_vehicle_management.controller.VehicleController;

public class MainView {
    public static void main(String[] args) {
        VehicleController vehicleController = new VehicleController();
        vehicleController.menuManagement();
    }
}
