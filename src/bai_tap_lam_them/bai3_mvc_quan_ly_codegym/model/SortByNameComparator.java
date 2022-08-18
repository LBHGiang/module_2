package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.model;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
