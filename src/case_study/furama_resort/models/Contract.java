package case_study.furama_resort.models;

import case_study.furama_resort.utils.my_date.MyDate;

public class Contract extends Booking {
    private String contractId;
    private double totalCost;
    private double deposits;

    public Contract() {
    }

    public Contract(String bookingId, String customerId, MyDate startDate, MyDate endDate, String serviceName, String serviceType, String contractId, double totalCost, double deposits) {
        super(bookingId, customerId, startDate, endDate, serviceName, serviceType);
        this.contractId = contractId;
        this.totalCost = totalCost;
        this.deposits = deposits;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    @Override
    public String toString() {
        return "Contract{ " + super.toString() +
                ", contractId=' " + contractId + '\'' + super.toString() +
                ", deposits=" + totalCost +
                ", totalCost=" + deposits +
                '}';
    }

    @Override
    public String toFileString() {
        return String.format("%s,%s,%s,%s", super.toFileString(), contractId, totalCost, deposits);
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
