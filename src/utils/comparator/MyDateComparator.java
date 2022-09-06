package utils.comparator;

import utils.my_date.DateAndName;

import java.util.Comparator;

public class MyDateComparator implements Comparator<DateAndName> {

    /**
     * Sắp xếp theo ngày số 1
     * Ngày số 1 trùng nhau thì so sánh ngày số 2
     * Cả 2 ngày trùng nhau thì so sánh theo tên
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(DateAndName o1, DateAndName o2) {
        if (!(o1.getDate1().compareTo(o2.getDate1()) == 0)) {
            return o1.getDate1().compareTo(o2.getDate1());
        }
        if (!(o1.getDate2().compareTo(o2.getDate2()) == 0)) {
            return o1.getDate2().compareTo(o2.getDate2());
        }
        return o1.getName().compareTo(o2.getName());

    }
}
