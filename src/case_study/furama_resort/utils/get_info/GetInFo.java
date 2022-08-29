package case_study.furama_resort.utils.get_info;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.IdExistedException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidFormatException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidNumberException;
import case_study.furama_resort.models.Employee;
import case_study.furama_resort.models.Facility;
import case_study.furama_resort.models.Person;
import case_study.furama_resort.utils.my_date.MyDate;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;

public class GetInFo {
    public static Scanner scanner = new Scanner(System.in);
    static int choose;

    /**
     * Hàm lấy dữ liệu đầu vào dạng String
     *
     * @param request           Dòng thông báo yêu cầu người dùng nhập
     * @param regex             Định dạng dữ liệu đầu vào
     * @param formatDescription Miêu tả định dạng
     * @param minLength         độ dài tối thiểu của dữ liệu
     * @param maxLength         độ dài tối đa của dữ liệu
     * @param lengthDescription Miêu tả độ dài.
     * @return
     */
    public static String getStringInfo(String request, String regex, String formatDescription, int minLength, int maxLength, String lengthDescription) {

        String property;
        while (true)
            try {
                System.out.print(request);
                property = scanner.nextLine();
                if (!property.matches(regex)) {
                    throw new InvalidFormatException("Input data is not in the correct format. Please re-enter.\n" +
                            formatDescription);
                }
                if (property.length() < minLength || property.length() > maxLength) {
                    throw new InvalidNumberException(lengthDescription + "Please re-enter!");
                }
                return property;
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy dữ liệu đầu vào dạng String
     *
     * @param request           Dòng thông báo yêu cầu người dùng nhập
     * @param regex             Định dạng dữ liệu đầu vào
     * @param formatDescription Miêu tả định dạng
     * @return
     */
    public static String getStringInfo(String request, String regex, String formatDescription) {

        String property;
        while (true)
            try {
                System.out.print(request);
                property = scanner.nextLine();
                if (!property.matches(regex)) {
                    throw new InvalidFormatException("Input data is not in the correct format. Please re-enter.\n" +
                            formatDescription);
                }
                return property;
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy lựa chọn
     *
     * @param request Dòng thông báo yêu cầu người dùng chọn.
     * @param options Mảng String[] các lựa chọn
     * @return lựa chọn của người dùng kiểu int
     */
    public static int takeChoice(String request, String[] options) {
        while (true) {
            try {
                System.out.println(request);
                for (int i = 0; i < options.length; i++) {
                    System.out.println((i + 1) + "\t" + options[i]); //1    Dimon
                }
                System.out.print("Please choose from 1 to " + options.length + ": ");
                choose = Integer.parseInt(scanner.nextLine());
                if (choose < 1 || choose > options.length) {
                    throw new InvalidNumberException("");
                }
                return choose;
            } catch (NumberFormatException | InvalidNumberException e) {
                System.out.println("Invalid data entered. Please choose from 1 to " + options.length);
            }
        }
    }

    /**
     * Hàm lấy dứ liệu số thực
     *
     * @param request Dòng thông báo yêu cầu người dùng chọn.
     * @param min     From min
     * @param max     to max
     * @return Số thực
     */
    public static double getDoubleNumber(String request, double min, double max) {
        double number;
        while (true)
            try {
                System.out.print(request);
                number = Double.parseDouble(scanner.nextLine());
                if (number < min || number > max) {
                    throw new InvalidNumberException("Data must be from " + min + " to " + max + " Please re-enter!");
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter number data!");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy dứ liệu số nguyên
     *
     * @param request Dòng thông báo yêu cầu người dùng chọn.
     * @param min     From min
     * @param max     to max
     * @return Số nguyên
     */
    public static int getIntegerNumber(String request, int min, int max) {
        int number;
        while (true)
            try {
                System.out.print(request);
                number = Integer.parseInt(scanner.nextLine());
                if (number < min || number > max) {
                    throw new InvalidNumberException("Data must be from " + min + " to " + max + " Please re-enter!");
                }
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Please enter integer data");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy ngày tháng dùng lớp Mydate tự định nghĩa
     *
     * @param request Dòng thông báo yêu cầu người dùng nhập dữ liệu
     * @return ngày tháng
     */
    public static MyDate getDateInfo(String request) {
        MyDate date;
        while (true)
            try {
                System.out.print(request);
                date = new MyDate(scanner.nextLine());
                return date;
            } catch (ParseException e) {
                System.out.println("Data is incorrect or not in the format dd/MM/yyyy. Please re-enter!");
            }
    }

    /**
     * Hàm lấy ngày tháng và check Age dùng lớp Mydate tự định nghĩa
     *
     * @param request Dòng thông báo yêu cầu người dùng nhập dữ liệu
     * @return ngày tháng
     */
    public static MyDate getDateInfo(String request, int minAge, int maxAge) {
        MyDate date;
        while (true)
            try {
                System.out.print(request);
                date = new MyDate(scanner.nextLine());
                if (date.getAge() < minAge || date.getAge() > maxAge) {
                    throw new InvalidNumberException("Age must be from " + minAge + " to " + maxAge + " years old");
                }
                return date;
            } catch (ParseException e) {
                System.out.println("Data is incorrect or not in the format dd/MM/yyyy. Please re-enter!");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Hàm lấy tên người
     * Định dạng: Không chứa số và kí tự đặc biệt
     * Các từ cách nhau bởi 1 dấu cách
     * Kí tự đầu và cuối không được là dấu cách
     *
     * @return Tên - String
     */
    public static String getNameInfo() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";
        return getStringInfo("Name: ", NAME_REGEX,
                "The name cannot contain numbers and special characters.",
                5, 10,
                "Length of name must be from 5 to 50 characters long");
    }

    /**
     * Hàm lấy email
     * Định dạng: Phần tên: ký tự chữ hoặc số + @
     * Phần mở rộng: Ký tự chữ hoặc số, có thể ngăn cách bằng 1 dấu .
     * Dấu . không nằm sau cùng
     * Kí tự đầu và cuối không được là dấu cách
     *
     * @return email - String
     */
    public static String getEmailInfo() {
        final String EMAIL_REGEX = "^[A-Za-z0-9]+@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        return getStringInfo("Email: ", EMAIL_REGEX,
                "Name: character or number +@+ Tail: character or number or 1 sign.\n" +
                        "Sign . not at the end.");
    }

    /**
     * Hàm lấy số điện thoại
     * Định dạng: xx-0xxxxxxxxx
     * Trong đó X là kí tự số. (sau - có 9 chữ số)
     *
     * @return email - String
     */
    public static String getPhoneNumberInfo() {
        final String PHONE_NUMBER_REGEX = "^\\d{2}[-]0\\d{9}$";
        return getStringInfo("Phone Number: ", PHONE_NUMBER_REGEX,
                "Phone number format must be: xx-0xxxxxxxxx");
    }

    /**
     * Hàm lấy giới tính. Cho người dùng chọn giới tính trong mảng.
     *
     * @return giới tính String
     */
    public static String getGenderInfo() {
        int choice = takeChoice("Gender: ", Person.GENDER_OPTIONS);
        return Person.GENDER_OPTIONS[choice - 1];
    }

    /**
     * Hàm lấy CMND dạng String.
     * Định dạng: 9 chữ số.
     * Số đầu tiên khác 0.
     *
     * @return giới tính String
     */
    public static String getIdentityCardInfo() {
        final String IDENTITY_CARD_REGEX = "^[1-9][0-9]{8}$";
        return getStringInfo("IdentityCard: ", IDENTITY_CARD_REGEX,
                "Identity Card number must be consists of 9 numbers, the first number is different from 0");
    }

    /**
     * @return
     */
    public static String getAddressInfo() {
        final String ADDRESS_REGEX = "^(\\p{L}+(\\s\\p{L}+)*)\\s\\-\\s(\\p{L}+(\\s\\p{L}+)*)$";
        return getStringInfo("Address: ", ADDRESS_REGEX,
                "Address in the format District Name - Province Name");
    }

    public static String getServiceId() {
        final String SERVICE_ID_REGEX = "^SV(VL|HO|RO)\\-\\d{4}]$";
        return getStringInfo("Service Id: ", SERVICE_ID_REGEX,
                "Service Id in the format SVXX-YYYY. XX is VL or HO or RO. Y is number.");
    }

    public static double getUsableArea() {
        return getDoubleNumber("Usable Area: ", 30, 999999999);
    }

    public static double getCost() {
        return getDoubleNumber("Cost Per Day: ", 0, 999999999);
    }

    public static double getMaxPeople() {
        return getIntegerNumber("Maximum number of people: ", 1, 20);
    }

    public static String getRentalType() {
        int choice = takeChoice("Rental Type: ", Facility.RENTAL_TYPE);
        return Facility.RENTAL_TYPE[choice - 1];
    }


}
