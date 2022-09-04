package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.utils.my_date.MyDate;
import utils.read_and_write_file_skip_line1.ReadFileUtil;

import java.text.ParseException;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ReadUnsignedFile {
    public Queue<Booking> readUnsignedFile() {
        final String UNSIGNED_CONTRACT_PATH = "src\\case_study\\furama_resort\\data\\unsigned_contract.csv";
        List<String> stringList = ReadFileUtil.readFile(UNSIGNED_CONTRACT_PATH);
        Queue<Booking> bookingQueue = new LinkedList<>();
        String[] info;
        for (String string :
                stringList) {
            info = string.split(",");
            try {
                bookingQueue.add(new Booking(
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
        return bookingQueue;
    }

}
