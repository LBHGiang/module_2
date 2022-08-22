package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model;

import java.util.Comparator;

public class SortByScoreComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.getScore(), o1.getScore());
    }
}
