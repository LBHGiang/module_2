package bai_tap_lam_them.bai3_mvc_quan_ly_codegym.service.utils;

public class ValidateName {
    /**
     * Hàm check định dạng tên lớp học.
     * Tên một lớp học hợp lệ cần đạt các yêu cầu sau:
     * Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P
     * Không chứa các ký tự đặc biệt
     * Theo sau ký tự bắt đầu là 4 ký tự số
     * Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M
     * Ví dụ tên lớp hợp lệ: C0318G
     * Ví dụ tên lớp không hợp lệ: M0318G, P0323A
     *
     * @param className tên lớp
     * @return true/false đúng định dạng hoặc không.
     */
    public static boolean validateClassName(String className) {
        final String classNameRegex = "[CAP]\\d{4}[GHIKLM]";
        return className.matches(classNameRegex);
    }
}
