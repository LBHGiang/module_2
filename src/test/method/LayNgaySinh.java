package test.method;

import bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils.InvalidAgeException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LayNgaySinh {

    /**
     * Hàm lấy ngày sinh từ người dùng.
     * Yêu cầu người dùng nhập đúng định dạng dd/MM/yyyy chặt chẽ.
     * @param ageFrom Tuổi nhỏ nhất (18)
     * @param ageTo Tuổi lớn nhất (100)
     * @return ngày sinh (String)
     */
    public String getDateOfBirthInfo(int ageFrom, int ageTo) {
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
                System.out.print("Vui lòng nhập ngày sinh: ");
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
                    throw new InvalidAgeException("Tuổi phải lớn hơn hoặc bằng 18 và nhỏ hơn hoặc bằng 100");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ngày sinh phải là chuỗi số có định dạng dd/MM/yyyy. Nhập lại: ");
            } catch (ParseException e) {
                System.out.println("Dữ liệu nhập vào chưa chính xác. Nhập lại: ");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
        return dateOfBirth;
    }
}