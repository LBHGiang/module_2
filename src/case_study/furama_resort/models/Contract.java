package case_study.furama_resort.models;

import case_study.furama_resort.services.utils.my_date.MyDate;

public class Contract extends Booking {
   private String contractId;
   private double deposits;
   private double totalCost;

    public Contract() {
    }

    public Contract(String bookingId, String customerId, MyDate startDate, MyDate endDate, String serviceName, String serviceType, String contractId, double deposits, double totalCost) {
        super(bookingId, customerId, startDate, endDate, serviceName, serviceType);
        this.contractId = contractId;
        this.deposits = deposits;
        this.totalCost = totalCost;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public double getDeposits() {
        return deposits;
    }

    public void setDeposits(double deposits) {
        this.deposits = deposits;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=' " + contractId + '\'' + super.toString()+
                ", deposits=" + deposits +
                ", totalCost=" + totalCost +
                '}';
    }
}
