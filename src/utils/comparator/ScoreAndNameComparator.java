package utils.comparator;

import bai_tap_lam_them.bai3_quan_ly_codegym.model.Student;

import java.util.Comparator;

public class ScoreAndNameComparator implements Comparator<Student> {
    /**
     * So sánh theo điểm, nếu điểm bằng nhau sắp xếp theo tên
     *
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getScore() - o2.getScore() == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return (int) (o1.getScore() - o2.getScore());
    }
}
