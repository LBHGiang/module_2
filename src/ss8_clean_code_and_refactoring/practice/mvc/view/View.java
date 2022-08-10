package ss8_clean_code_and_refactoring.practice.mvc.view;

import ss8_clean_code_and_refactoring.practice.mvc.controller.StudentController;

public class View {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        studentController.displayMenu();
    }
}
