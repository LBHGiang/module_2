package utils.comparator;

import bai_tap_lam_them.bai2_quan_li_danh_sach_sinh_vien.Student;

import java.util.Comparator;

public class NameComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
