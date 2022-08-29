package case_study.furama_resort.services.impls;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import case_study.furama_resort.models.Customer;
import case_study.furama_resort.services.ICustomerService;
import case_study.furama_resort.utils.get_info.GetInFo;
import case_study.furama_resort.utils.read_and_write.ReadCustomerFile;
import case_study.furama_resort.utils.read_and_write.WriteCustomerFile;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String CUSTOMER_PATH = "src\\case_study\\furama_resort\\data\\customer.csv";
    private static final ReadCustomerFile readCustomerFile = new ReadCustomerFile();
    private static final WriteCustomerFile writeCustomerFile = new WriteCustomerFile();

    private static List<Customer> customerList;

    @Override
    public void displayList() {
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        if (customerList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        System.out.println("----------Customer List----------");
        for (Customer customer : customerList
        ) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNewObject() {
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        System.out.println("Please enter the following information:");

        customerList.add(new Customer(
                getAndCheckId(customerList),
                GetInFo.getNameInfo(),
                getBirthdayInfo(),
                GetInFo.getGenderInfo(),
                getAndCheckIdentityCard(customerList),
                GetInFo.getPhoneNumberInfo(),
                GetInFo.getEmailInfo(),
                getCustomerType(),
                GetInFo.getAddressInfo()));

        System.out.println("Added new customer successfully!");
        writeCustomerFile.writeCustomerFile(CUSTOMER_PATH, customerList);
        displayList();
    }


    @Override
    public void editInfo() {
        customerList = readCustomerFile.readCustomerFile(CUSTOMER_PATH);
        if (customerList.size() == 0) {
            System.out.println("Empty list!");
            return;
        }
        Customer customer = findCustomerById(customerList);
        if (customer == null) {
            System.out.println("Id does not exist in the list!");
            return;
        }

        System.out.println("------------------------------------");
        System.out.println("Employee need to edit information:");
        System.out.println(customer.toString());
        do {
            String[] editOptions = {"Id", "Name", "DateOfBirth", "Gender", "IdentityCard",
                    "PhoneNumber", "Email", "Customer Type", "Address", "Return"};
            int choose = GetInFo.takeChoice("Select the content to edit: ", editOptions);

            switch (choose) {
                case 1:
                    customer.setId(getAndCheckId(customerList));
                    break;
                case 2:
                    customer.setName(GetInFo.getNameInfo());
                    break;
                case 3:
                    customer.setDateOfBirth(getBirthdayInfo());
                    break;
                case 4:
                    customer.setGender(GetInFo.getGenderInfo());
                    break;
                case 5:
                    customer.setIdentityCard(getAndCheckIdentityCard(customerList));
                    break;
                case 6:
                    customer.setPhoneNumber(GetInFo.getPhoneNumberInfo());
                    break;
                case 7:
                    customer.setEmail(GetInFo.getEmailInfo());
                    break;
                case 8:
                    customer.setCustomerType(getCustomerType());
                    break;
                case 9:
                    customer.setAddress(GetInFo.getAddressInfo());
                    break;
                case 11:
                    System.out.println("Thanks and see you again!");
                    return;
                default:
                    System.out.println("Your choice is not correct!");
                    return;
            }
            System.out.println("Editing is successful!");
            System.out.println(customer.toString());
            writeCustomerFile.writeCustomerFile(CUSTOMER_PATH, customerList);

            System.out.println("Do you want to continue editing?");
            System.out.printf("%-10sContinue\n%-10sCompleted", 1, "Other");
            String accept = scanner.nextLine();
            if (!accept.equals("1")) {
                System.out.println("Return");
                return;
            }
        } while (true);
    }

    private Customer findCustomerById(List<Customer> list) {
        final String ID_REGEX = "^\\S+$";
        String id = GetInFo.getStringInfo("Please enter Customer ID: ", ID_REGEX, "Id must not contain spaces");
        for (Customer customer : list
        ) {
            if (customer.getId().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    /**
     * Nhập và kiểm tra ID
     * Định dạng ID: Không chứa khoảng trắng
     *
     * @return
     */
    private String getAndCheckId(List<Customer> list) {
        final String ID_REGEX = "^\\S+$";
        while (true) {
            String id = GetInFo.getStringInfo("ID: ", ID_REGEX, "Id must not contain spaces");
            try {
                for (Customer customer : list
                ) {
                    if (customer.getId().equals(id)) {
                        throw new IdExistedException("Id already exists! Please re-enter!");
                    }
                }
                return id;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String getAndCheckIdentityCard(List<Customer> list) {
        while (true) {
            String identityCard = GetInFo.getIdentityCardInfo();
            try {
                for (Customer customer : list
                ) {
                    if (customer.getIdentityCard().equals(identityCard)) {
                        throw new IdExistedException("IdentityCard already exists! Please re-enter!");
                    }
                }
                return identityCard;
            } catch (IdExistedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private String getBirthdayInfo() {
        return GetInFo.getDateInfo("Date Of Birth: ", 15, 100).getStrDate();
    }

    private String getCustomerType() {
        int choice = GetInFo.takeChoice("Customer Type: ", Customer.CUSTOMER_TYPE_OPTIONS);
        return Customer.CUSTOMER_TYPE_OPTIONS[choice - 1];
    }

}
