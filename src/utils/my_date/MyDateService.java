package utils.my_date;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidNumberException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MyDateService {
    /**
     * Sử dụng lớp MyDate
     * Nhập ngày sinh đến khi đúng.
     * Đúng định dạng dd/MM/yyyy
     *
     * @param ageFrom,ageTo Tuổi từ ageFrom - đến ageTo
     * @return date ngày sinh String
     */
    public static String getDateInfo(int ageFrom, int ageTo) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Scanner scanner = new Scanner(System.in);

        String strDateOfBirth;
        MyDate dateOfBirth;
        while (true) {
            try {
                System.out.print("Ngày sinh: ");
                strDateOfBirth = scanner.nextLine();
                dateOfBirth = new MyDate(strDateOfBirth);
                //Kiểm tra tuổi nhập vào
                if (dateOfBirth.getAge() < ageFrom || dateOfBirth.getAge() > ageTo) {
                    throw new InvalidNumberException("Tuổi phải lớn hơn hoặc bằng " + ageFrom + " và nhỏ hơn hoặc bằng " + ageTo);
                }
                return strDateOfBirth;
            } catch (ParseException e) {
                System.out.println("Dữ liệu nhập vào chưa chính xác hoặc chưa đúng định dạng dd/MM/yyyy. Nhập lại: ");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
