package test.ngoai_le.kiem_tra_so_nhap_vao;

public class InvalidNumberException extends Exception {


    public InvalidNumberException(String str) {
        super(str);
    }

    /**
     * Hàm kiểm tra đầu vào của số nhập vào
     *
     * @param number
     * @throws InvalidNumberException
     */
    public static void checkNumber(double number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Lỗi: Nhập điều kiện của số vào đây!!!!");
        }
    }





}
