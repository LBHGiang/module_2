package bai_tap_lam_them.bai3_codegym_copy.model;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student> {
    @Override
    public int compare(bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model.Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
