package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidDateException;
import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.services.IBookingService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.my_date.MyDate;
import case_study.furama_resort.utils.read_and_write.ReadBookingFile;
import case_study.furama_resort.utils.read_and_write.ReadCustomerFile;
import case_study.furama_resort.utils.read_and_write.WriteBookingFile;

import java.util.*;

public class BookingService implements IBookingService {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ReadCustomerFile readCustomerFile = new ReadCustomerFile();
    private static final String CUSTOMER_PATH = "src\\case_study\\furama_resort\\data\\customer.csv";
    public static final ReadBookingFile readBookingFile = new ReadBookingFile();
    public static final WriteBookingFile writeBookingFile = new WriteBookingFile();
    private static Set<Booking> bookingList;
    protected static final Queue<Booking> bookingQueue = new LinkedList<>();

    protected static Queue<Booking> getBookingQueue() {
        return bookingQueue;
    }

    @Override
    public void displayList() {
        bookingList = readBookingFile.readBookingFile();
        if (bookingList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("----------Booking List----------");
        for (Booking booking : bookingList
        ) {
            System.out.println(booking.toString());
        }
    }

    @Override
    public void addNewObject() {
        bookingList = readBookingFile.readBookingFile();
        System.out.println("Please enter the following information:");
        String serviceId = getServiceId();
        Booking booking = new Booking(
                getBookingId(bookingList),
                getCustomerId(),
                getStartDate(),
                getEndDate(),
                serviceId,
                "ServiceType");
        bookingList.add(booking);
        if (serviceId.contains("VL") || serviceId.contains("HO")) {
            bookingQueue.add(booking);
        }
        System.out.println("Added new booking successfully!");
        writeBookingFile.writeBookingFile(bookingList);
        displayList();
    }

    public String getBookingId(Set<Booking> bookingSet) {
        while (true) {
            String id = GetInFo.getStringInfo("Booking Id: ");
            try {
                for (Booking booking : bookingSet
                ) {
                    if (booking.getBookingId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getCustomerId() {
        List<Customer> customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        int choice = GetInFo.takeChoice("Please choose Customer: ", customerList, "Not exist. Add new customer ");
        if (choice == customerList.size() + 1) {
            CustomerService customerService = new CustomerService();
            return customerService.addNewCustomer();
        }
        return customerList.get(choice - 1).getId();
    }

    private MyDate startDate;

    public MyDate getStartDate() {
        while (true) {
            try {
                startDate = GetInFo.getDateInfo("Start Date: ");
                if (!startDate.checkBookingDate()) {
                    throw new InvalidDateException("Start date must be in the future");
                }
                return startDate;
            } catch (InvalidDateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public MyDate getEndDate() {
        MyDate endDate;
        while (true) {
            try {
                endDate = GetInFo.getDateInfo("End Date: ");
                if (!MyDate.checkOrder(startDate, endDate)) {
                    throw new InvalidDateException("The end date must be after the start date");
                }
                return endDate;
            } catch (InvalidDateException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public String getServiceId() {
        List<Facility> facilityList = FacilityService.getFacilityList();
        List<Facility> activeFacility = new ArrayList<>();
        for (Facility facility: facilityList
             ) {
            facility.getStatus()
        }



        int choice = GetInFo.takeChoice("Choose service: ", facilityList);
        return facilityList.get(choice - 1).getServiceId();
    }

}
