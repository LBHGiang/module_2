package utils.my_date;

import utils.comparator.MyDateComparator;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class MainTest {
    public static void main(String[] args) throws ParseException {
        List<DateAndName> dateAndNames = new ArrayList<>();

        dateAndNames.add(new DateAndName(new MyDate("13/1/1111"), new MyDate("17/1/1111"), "Giang"));
        dateAndNames.add(new DateAndName(new MyDate("15/1/1111"), new MyDate("19/1/1111"), "Hoàng"));
        dateAndNames.add(new DateAndName(new MyDate("13/1/1111"), new MyDate("18/1/1111"), "Nam"));
        dateAndNames.sort(new MyDateComparator());
        System.out.println(dateAndNames);

    }

}

