package case_study.furama_resort.models;

import case_study.furama_resort.utils.my_date.MyDate;

public class Booking implements Comparable<Booking> {
    private String bookingId;
    private String customerId;
    private MyDate startDate;
    private MyDate endDate;
    private String serviceName;
    private String serviceType;

    public Booking() {
    }

    public Booking(String bookingId, String customerId, MyDate startDate, MyDate endDate, String serviceName, String serviceType) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.startDate = startDate;
        this.endDate = endDate;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public MyDate getStartDate() {
        return startDate;
    }

    public void setStartDate(MyDate startDate) {
        this.startDate = startDate;
    }

    public MyDate getEndDate() {
        return endDate;
    }

    public void setEndDate(MyDate endDate) {
        this.endDate = endDate;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", customerId='" + customerId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", serviceName='" + serviceName + '\'' +
                ", serviceType='" + serviceType + '\'' +
                '}';
    }

    public String toFileString() {
        return String.format("%s,%s,%s,%s,%s,%s", bookingId, customerId, startDate, endDate, serviceName, serviceType);
    }

    @Override
    public int compareTo(Booking o) {
        if (MyDate.checkOrder(this.getStartDate(), o.getStartDate())) {
            return 1;
        }
        if (MyDate.checkOrder(this.getEndDate(), o.getEndDate())) {
            return 1;
        }
        return 0;
    }
}
