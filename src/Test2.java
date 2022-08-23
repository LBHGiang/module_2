import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils.InvalidAgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setLenient(false);
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("Nhập ngày sinh");
            String ngaySinh = scanner.nextLine();

            Date now = new Date();
            String strNow = sdf.format(now);
            int yearNow = Integer.parseInt(strNow.substring(strNow.length() - 4));
            Date checkFormat = null;
            try {
                int yearOfBirth = Integer.parseInt(ngaySinh.substring(ngaySinh.length() - 4));
                int age = yearNow - yearOfBirth;
                checkFormat = sdf.parse(ngaySinh);
                if (age < 18 || age > 100){
                    throw new InvalidAgeException("Tuổi phải lớn hơn hoặc bằng 18 và nhỏ hơn hoặc bằng 100");
                }

            } catch (ParseException e) {
                System.out.println("Sai định dạng");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}
