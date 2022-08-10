package test.method.nam_nhuan;

public class HamKiemTraNamNhuan {

    public static int getDaysOfMonth(int month, int year) {
        switch (month) {
            case 1:
                return 31;
            case 2: {
                return isLeapYear(year) ? 29 : 28;
            }
            case 4:
                return 30;
            default:
                return -1;
        }
    }

    public static boolean isLeapYear(int year) {
        boolean divisibleBy4 = year % 4 == 0;
        boolean divisibleBy100 = year % 100 == 0;
        boolean divisibleBy400 = year % 400 == 0;
        return divisibleBy4 && !divisibleBy100 || divisibleBy400;
    }

}
