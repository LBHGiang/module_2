package ngoai_le.kiemtra3canhTamgiac;

public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(String str) {
        super(str);
    }

    public static void checkIllegalTriangle(double a, double b, double c)
            throws ss15_exception_debug.exercise.IllegalTriangleException {
        if (a + b <= c || b + c <= a || c + a <= b) throw new ss15_exception_debug.exercise.IllegalTriangleException("Lỗi: Tam giác không hợp lệ!");
    }
}