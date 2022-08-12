package bai_tap_lam_them.bai_demo.view;

import bai_tap_lam_them.bai_demo.controller.StudentController;

public class MainView {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.menuManagement();
    }
}
