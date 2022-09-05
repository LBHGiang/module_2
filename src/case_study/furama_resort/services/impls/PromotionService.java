package case_study.furama_resort.services.impls;

import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.services.IPromotionService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadBookingFile;
import case_study.furama_resort.utils.read_and_write.ReadCustomerFile;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PromotionService implements IPromotionService {
    public static final ReadBookingFile readBookingFile = new ReadBookingFile();
    public static final ReadCustomerFile readCustomerFile = new ReadCustomerFile();
    private static Set<Booking> bookingList;
    private static Set<String> customerId = new LinkedHashSet<>();
    private static List<Customer> customerList;
    private static final String CUSTOMER_PATH = "src\\case_study\\furama_resort\\data\\customer.csv";


    @Override
    public void displayListCustomersUseService() {
        bookingList = readBookingFile.readBookingFile();
        if (bookingList.isEmpty()) {
            System.out.println("Booking list is empty!");
            return;
        }
        int year = getYear();
        for (Booking booking : bookingList
        ) {
            if (booking.getStartDate().getDate().getYear() + 1900 == year) {
                customerId.add(booking.getCustomerId());
            }
        }
        if (customerId.isEmpty()) {
            System.out.println("In " + year + " Booking list is empty!");
            return;
        }
        System.out.println("Customer List in " + year);
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        for (String s : customerId) {
            for (Customer customer : customerList) {
                if (s.equals(customer.getId())) {
                    System.out.println(customer.toString());
                }
            }
        }
    }

    @Override
    public void displayListCustomersGetVoucher() {

    }

    public int getYear() {
        return GetInFo.getIntegerNumber("Year: ", 1990, 2233);
    }


}
