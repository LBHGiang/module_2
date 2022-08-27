package case_study.furama_resort.models;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyDate implements Comparable<MyDate> {
    private static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    private String strDate;
    private Date date = new Date();

    public MyDate() {
    }

    public MyDate(String strDate) throws ParseException {
        this.strDate = strDate;
        this.date = formatter.parse(this.strDate);
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) throws ParseException {
        this.strDate = strDate;
        this.date = formatter.parse(this.strDate);
    }

    public Date getDate() {
        return date;
    }

    public static int getAge(MyDate myDate) throws ParseException {
        Date now = new Date();
        return (int) ((now.getTime() - myDate.getDate().getTime()) / 31556926 / 1000);
    }

    public static int getDays(MyDate startDate, MyDate endDate) {
        return (int) ((endDate.getDate().getTime() - startDate.getDate().getTime()) / 86400000);
    }

    @Override
    public String toString() {
        return strDate;
    }

    @Override
    public int compareTo(MyDate o) {
        return (int) (this.getDate().getTime() - o.getDate().getTime());
    }


    //test
//    public static void main(String[] args) throws ParseException {
//        MyDate sinhNhat1 = new MyDate("03/03/1998");
//        MyDate sinhNhat2 = new MyDate("03/04/1998");
//        System.out.println(MyDate.getAge(sinhNhat1));
//        System.out.println(sinhNhat1.compareTo(new MyDate()));
//        System.out.println(MyDate.getDays(sinhNhat1, sinhNhat2));
//    }
}
