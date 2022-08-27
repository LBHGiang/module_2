package utils.validate;

import bai_tap_lam_them.bai3_quan_ly_codegym.service.utils.InvalidNumberException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ValidateDate{
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
                System.out.println(sdf.parse(dateOfBirth).getClass());
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

    public static void main(String[] args) {
        getDateInfo(1,199);
    }
}