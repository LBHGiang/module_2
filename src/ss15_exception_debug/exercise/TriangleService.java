package ss15_exception_debug.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TriangleService {
    public static Scanner scanner = new Scanner(System.in);
    List<Triangle> triangles = new ArrayList<>();

    public Triangle createTriangle() {

        double side1;
        double side2;
        double side3;
        while (true) {
            try {
                System.out.println("Nhập vào độ dài 3 cạnh của tam giác: ");
                side1 = getSideOfTriangle("Cạnh thứ 1 = ");
                side2 = getSideOfTriangle("Cạnh thứ 2 = ");
                side3 = getSideOfTriangle("Cạnh thứ 3 = ");
                if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
                    throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ!");
                }
                break;
            } catch (IllegalTriangleException e) {
                System.out.println(e.getMessage());
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
                checkNumber(side);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập vào chưa đúng định dạng số!");
            } catch (InvalidNumberException e) {
                System.out.println(e.getMessage());
            }
        }

        return side;
    }

    public void checkNumber(double number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Lỗi: Cạnh của tam giác phải > 0");
        }
    }

}
