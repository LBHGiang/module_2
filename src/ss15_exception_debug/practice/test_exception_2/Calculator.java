package ss15_exception_debug.practice.test_exception_2;

public class Calculator {

    public static void calculate(int x, int y) {
        try {
            System.out.printf("x + y = %s\n", x + y);
            System.out.printf("x - y = %s\n", x - y);
            System.out.printf("x * y = %s\n", x * y);
            System.out.printf("x / y = %s\n", x / y);
        } catch (NumberFormatException e) {
            System.out.printf("Dữ liệu nhập vào không hợp lệ: %s", e.getMessage());
        } catch (ArithmeticException e) {
            System.out.printf("Không thể: %s", e.getMessage());
        }

    }
}
