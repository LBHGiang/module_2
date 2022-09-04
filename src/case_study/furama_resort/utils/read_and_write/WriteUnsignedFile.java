package case_study.furama_resort.utils.read_and_write;

import case_study.furama_resort.models.Booking;
import utils.read_and_write_file_skip_line1.WriteFileUtil;

import java.util.Queue;

public class WriteUnsignedFile {
    public void writeUnsignedFile(Queue<Booking> bookingQueue) {
        final String UNSIGNED_CONTRACT_PATH = "src\\case_study\\furama_resort\\data\\unsigned_contract.csv";
        StringBuilder data = new StringBuilder("BookingId, CustomerId, StartDate, EndDate, ServiceName,ServiceType\n");

        for (Booking booking : bookingQueue) {
            data.append(booking.toFileString()).append("\n");
        }

        WriteFileUtil.writeFile(UNSIGNED_CONTRACT_PATH, data.toString());
    }
}
