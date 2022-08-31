package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.utils.my_date.MyDate;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.text.ParseException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadBookingFile {
    public Set<Booking> readBookingFile() {
        final String BOOKING_PATH = "src\\case_study\\furama_resort\\data\\booking.csv";
        List<String> stringList = ReadFileUtil.readFile(BOOKING_PATH);
        Set<Booking> bookingSet = new TreeSet<>();
        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            try {
                bookingSet.add(new Booking(
                        info[0],
                        info[1],
                        new MyDate(info[2]),
                        new MyDate(info[3]),
                        info[4],
                        info[5]));
            } catch (ParseException e) {
                System.out.println("The data in the file is incorrect!");
            }
        }
        return bookingSet;
    }

}
