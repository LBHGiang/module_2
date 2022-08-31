package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Booking;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.List;
import java.util.Set;

public class WriteBookingFile {
    public void writeBookingFile(Set<Booking> bookingList) {
        final String BOOKING_PATH = "src\\case_study\\furama_resort\\data\\booking.csv";
        StringBuilder data = new StringBuilder("BookingId, CustomerId, StartDate, EndDate, ServiceName,ServiceType\n");

        for (Booking booking : bookingList) {
            data.append(booking.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(BOOKING_PATH, data.toString());
    }
}
