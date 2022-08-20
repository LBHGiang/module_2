package ss15_exception_debug.exercise;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String str) {
        super(str);
    }

    public static void checkIllegalTriangle(double a, double b, double c)
            throws IllegalTriangleException {
        if (a + b <= c || b + c <= a || c + a <= b)
            throw new IllegalTriangleException("Lỗi: Tam giác không hợp lệ!");
    }
}
