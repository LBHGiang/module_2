import case_study.furama_resort.utils.my_date.MyDate;

import java.text.ParseException;
import java.util.*;

class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws ParseException {
        MyDate myDate = new MyDate("02/03/1999");
        System.out.println(myDate.getDate().getYear());


    }
}