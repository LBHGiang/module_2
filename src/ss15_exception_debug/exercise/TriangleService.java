package ss15_exception_debug.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleService {
    public static Scanner scanner = new Scanner(System.in);
    List<Triangle> triangles= new ArrayList<>();

    public Triangle createTriangle() {
        System.out.println("Nhập vào độ dài 3 cạnh của tam giác: ");
        double side1;
        double side2;
        double side3;
        while (true) {
            try {
                side1 = getSideOfTriangle("Cạnh thứ 1 = ");
                side2 = getSideOfTriangle("Cạnh thứ 2 = ");
                side3 = getSideOfTriangle("Cạnh thứ 3 = ");
                IllegalTriangleException.checkIllegalTriangle(side1, side2, side3);
                break;
            } catch (IllegalTriangleException e) {
                e.printStackTrace();
            }
        }
        return new Triangle(side1, side2, side3);
    }

    public double getSideOfTriangle(String str) {
        double side;
        while (true) {
            try {
                System.out.println(str);
                side = Double.parseDouble(scanner.nextLine());
                InvalidNumberException.checkNumber(side);
                break;
            } catch (InvalidNumberException e) {
                e.printStackTrace();
            } catch (NumberFormatException e){
                System.out.println("Bạn nhập vào chưa đúng định dạng số!");
            }
        }

        return side;
    }

}
