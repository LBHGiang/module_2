package bai_tap_lam_them.bai3_quan_ly_codegym.service.impl;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.EmptyInputException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidFormatException;
import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidNumberException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CommonService{
    public static Scanner scanner = new Scanner(System.in);
    private static final String STUDENT = "student";
    private static final String TEACHER = "teacher";
    private static final String[] GENDER = {"", "Nam", "Nữ", "Khác"};
    private static final int NAM = 1;
    private static final int NỮ = 2;
    private static final int KHÁC = 3;
    static int choose;


    /**
     * Cho người dùng chọn giới tính: 1-Nam. 2-Nữ. 3-Khác.
     *
     * @return giới tính dạng String
     */
    public static String getGenderInfo() {
        while (true) {
            try {
                System.out.println("Giới tính: Vui lòng chọn 1, 2 hoặc 3.");
                System.out.printf("%s-%s    %s-%s    %s-%s", NAM, "Nam", NỮ, "nữ", KHÁC, "Khác");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case NAM:
                        return GENDER[NAM];
                    case NỮ:
                        return GENDER[NỮ];
                    case KHÁC:
                        return GENDER[KHÁC];
                    default:
                        System.out.println("Lựa chọn bạn nhập chưa đúng. Vui lòng nhập lại!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lựa chọn bạn nhập chưa đúng. Vui lòng nhập lại!");
            }
        }
    }

    /**
     * Nhập ngày sinh đến khi đúng.
     * Đúng định dạng dd/MM/yyyy
     * Tuổi từ 18-100
     *
     * @param ageFrom,ageTo Tuổi từ - đến.
     * @return date ngày sinh
     */
    public static String getDateInfo(int ageFrom, int ageTo) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Scanner scanner = new Scanner(System.in);
        String dateOfBirth;
        Date checkFormat;
        Date now;
        String strNow;
        int yearNow;
        int yearOfBirth;
        int age;
        while (true) {
            try {
                System.out.print("Ngày sinh: ");
                dateOfBirth = scanner.nextLine();
                checkFormat = sdf.parse(dateOfBirth);//check dữ liệu nhập vào
                now = new Date();//Thời gian hiện tại
                strNow = sdf.format(now);//format thành chuỗi dạng  dd/MM/yyyy

                //lấy năm hiện tại
                yearNow = Integer.parseInt(strNow.substring(strNow.length() - 4));

                //lấy năm sinh
                yearOfBirth = Integer.parseInt(dateOfBirth.substring(dateOfBirth.length() - 4));

                age = yearNow - yearOfBirth; //tính tuổi đến hiện tại

                //Kiểm tra tuổi nhập vào
                if (age < ageFrom || age > ageTo) {
                    throw new InvalidNumberException("Tuổi phải lớn hơn hoặc bằng " + ageFrom + " và nhỏ hơn hoặc bằng " + ageTo);
                }
                return dateOfBirth;
            } catch (NumberFormatException e) {
                System.out.println("Ngày sinh phải là chuỗi số có định dạng dd/MM/yyyy. Vui lòng nhập lại: ");
            } catch (ParseException e) {
                System.out.println("Dữ liệu nhập vào chưa chính xác. Nhập lại: ");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    /**
     * Nhập tên, kiểm tra định dạng và độ dài
     * Tên không được chứa số và ký tự đặc biệt.
     * Yêu cầu chỉ từ 5 đến 50 kí tự
     * Được phép viết thường hoặc viết hoa
     *
     * @param
     * @return name
     */
    public static String getNameInfo() {
        final String NAME_REGEX = "^\\p{L}+(\\s\\p{L}+)*$";//dễ dãi
        //final String NAME_REGEX = "^\\p{Lu}\\p{Ll}+(\\s\\p{Lu}\\p{Ll}+)*$"; //khắt khe

        String name;
        while (true)
            try {
                System.out.print("Name: ");
                name = scanner.nextLine();
                if (!name.matches(NAME_REGEX)) {
                    throw new InvalidFormatException("Tên chưa đúng định dạng! " +
                            "Tên không được chứa số và kí tự đặc biệt.\nVui lòng nhập lại!");
                }
                if (name.length() < 5 || name.length() > 50) {
                    throw new InvalidNumberException("Tên phải từ 5 đến 50 ký tư. Vui lòng nhập lại!");
                }
                return name;
            } catch (InvalidFormatException e) {
                System.out.println(e.getMessage());
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
    }

    /**
     * Nhập id đến khi đúng định dạng ID
     * Định dạng tạm thời là khác ""
     *
     * @return id
     */
    public static String getIdInfo() {
        String id;
        while (true)
            try {
                System.out.print("ID: ");
                id = scanner.nextLine();
                if (id.equals("")) {
                    throw new EmptyInputException("Vui lòng nhập dữ liệu vào!");
                }
                return id;
            } catch (EmptyInputException e) {
                System.out.println(e.getMessage());
            }
    }
}
