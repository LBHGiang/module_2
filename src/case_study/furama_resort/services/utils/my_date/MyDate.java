package case_study.furama_resort.services.utils.my_date;


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
        formatter.setLenient(false);
        this.strDate = strDate;
        this.date = formatter.parse(this.strDate);
    }

    public String getStrDate() {
        return strDate;
    }

    public void setStrDate(String strDate) throws ParseException {
        formatter.setLenient(false);
        this.strDate = strDate;
        this.date = formatter.parse(this.strDate);
    }

    public Date getDate() {
        return date;
    }

    public int getAge() throws ParseException {
        Date now = new Date();
        return (int) ((now.getTime() - this.date.getTime()) / 31556926 / 1000);
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

}
