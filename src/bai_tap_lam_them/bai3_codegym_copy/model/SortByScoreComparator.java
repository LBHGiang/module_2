package bai_tap_lam_them.bai3_codegym_copy.model;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;

import java.util.Comparator;

public class SortByScoreComparator implements Comparator<bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student> {
    @Override
    public int compare(bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student o1, Student o2) {
        return Double.compare(o2.getScore(), o1.getScore());
    }
}
