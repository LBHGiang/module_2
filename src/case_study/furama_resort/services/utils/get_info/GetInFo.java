package case_study.furama_resort.services.utils.get_info;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidFormatException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidNumberException;
import case_study.furama_resort.services.utils.my_date.MyDate;

import java.text.ParseException;
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
                    System.out.println((i + 1) + "\t" + options[i]);
                }
                choose = Integer.parseInt(scanner.nextLine());
                if (choose < 1 || choose > options.length) {
                    throw new InvalidNumberException("");
                }
                return choose-1;
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
                number = Integer.parseInt((scanner.nextLine()));
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

}
