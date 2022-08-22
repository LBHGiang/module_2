package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service;

import java.io.IOException;

public interface IStudentService {
    void displayAllStudent() throws IOException;

    void addStudent() throws IOException;

    void editStudent() throws IOException;

    void removeStudent() throws IOException;

    void findStudentByID() throws IOException;

    void findStudentByName() throws IOException;

    void sortStudentByScore() throws IOException;

    void sortStudentByName() throws IOException;

    void sortStudentByHand() throws IOException;
}
