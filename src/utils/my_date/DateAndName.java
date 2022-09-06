package utils.my_date;

public class DateAndName {
    private MyDate date1;
    private MyDate date2;
    private String name;

    public DateAndName(MyDate date1, MyDate date2, String name) {
        this.date1 = date1;
        this.date2 = date2;
        this.name = name;
    }

    public MyDate getDate1() {
        return date1;
    }

    public void setDate1(MyDate date1) {
        this.date1 = date1;
    }

    public MyDate getDate2() {
        return date2;
    }

    public void setDate2(MyDate date2) {
        this.date2 = date2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Test{" +
                "date1=" + date1 +
                ", date2=" + date2 +
                ", name='" + name + '\'' +
                '}';
    }

}