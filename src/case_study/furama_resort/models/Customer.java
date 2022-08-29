package case_study.furama_resort.models;

public class Customer extends Person {
    private String customerType;
    private String address;
    public static final String[] CUSTOMER_TYPE_OPTIONS = {"Diamond", "Platinum", "Gold", "Silver", "Member"};

    public Customer() {
    }

    public Customer(String id, String name, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String customerType, String address) {
        super(id, name, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{ " + super.toString() +
                " customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public String toFileString() {
        return String.format("%s,%s,%s", super.toFileString(), customerType, address);
    }

}
