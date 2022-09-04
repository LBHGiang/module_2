import case_study.furama_resort.utils.my_date.MyDate;

import java.text.ParseException;
import java.util.*;

class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        Set<MyDate> myDates = new TreeSet<>();
        myDates.add(new MyDate("22/11/1111"));
        myDates.add(new MyDate("20/11/1111"));
        myDates.add(new MyDate("21/11/1111"));
        myDates.add(new MyDate("19/12/1111"));
        System.out.println(myDates);

    }
}