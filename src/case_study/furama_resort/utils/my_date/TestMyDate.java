package case_study.furama_resort.utils.my_date;

import java.text.ParseException;

public class TestMyDate {
    //test
    public static void main(String[] args) throws ParseException {
        MyDate sinhNhat1 = new MyDate("03/03/1998");
        MyDate sinhNhat2 = new MyDate("03/04/1998");
        System.out.println(sinhNhat1.getAge());
        System.out.println(sinhNhat1.compareTo(new MyDate()));
        System.out.println(MyDate.getDays(sinhNhat1, sinhNhat2));
    }
}
