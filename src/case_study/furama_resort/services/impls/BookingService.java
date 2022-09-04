package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidDateException;
import case_study.furama_resort.models.Booking;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.Room;
import case_study.furama_resort.services.IBookingService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.my_date.MyDate;
import case_study.furama_resort.utils.read_and_write.*;

import java.util.*;

public class BookingService implements IBookingService {
    private static final Scanner scanner = new Scanner(System.in);
    public static final ReadCustomerFile readCustomerFile = new ReadCustomerFile();
    public static final ReadUnsignedFile readUnsignedFile = new ReadUnsignedFile();
    public static final WriteUnsignedFile writeUnsignedFile = new WriteUnsignedFile();
    private static final String CUSTOMER_PATH = "src\\case_study\\furama_resort\\data\\customer.csv";
    public static final ReadBookingFile readBookingFile = new ReadBookingFile();
    public static final WriteBookingFile writeBookingFile = new WriteBookingFile();
    public static final FacilityService facilityService = new FacilityService();
    private static Set<Booking> bookingList;
    protected Queue<Booking> bookingQueue;

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
        String bookingId = getBookingId(bookingList);
        String customerId = getCustomerId();
        Facility facility = getService();
        Booking booking = new Booking(
                bookingId,
                customerId,
                getStartDate(),
                getEndDate(),
                facility.getServiceId(),
                "ServiceType");
        bookingList.add(booking);
        if (!(facility instanceof Room)) {
            bookingQueue = readUnsignedFile.readUnsignedFile();
            bookingQueue.add(booking);
            writeUnsignedFile.writeUnsignedFile(bookingQueue);
        }
        facilityService.editFacilityStatus(facility);
        MaintainService.countTimeUsed(facility);
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
        List<Customer> customerList;
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        int choice = GetInFo.takeChoice("Please choose Customer: ", customerList, "Not exist. Add new customer ");
        if (choice == customerList.size() + 1) {
            CustomerService customerService = new CustomerService();
            customerService.addNewObject();
        }
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
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

    public Facility getService() {
        List<Facility> facilityList = FacilityService.getFacilityList();
        List<Facility> activeFacility = new ArrayList<>();
        for (Facility facility : facilityList
        ) {
            if (facility.isActive()) {
                activeFacility.add(facility);
            }
        }
        int choice = GetInFo.takeChoice("Choose service: ", activeFacility);
        return activeFacility.get(choice - 1);
    }

}
