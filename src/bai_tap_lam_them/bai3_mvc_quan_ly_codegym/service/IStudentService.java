package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service;

import java.io.IOException;

public interface IStudentService {
    void displayAllStudent();

    void addStudent();

    void editStudent();

    void removeStudent();

    void findStudentByID();

    void findStudentByName();

    void sortStudentByScore();

    void sortStudentByName();

    void sortStudentByHand();
}
