package test.ngoai_le.kiem_tra_so_nhap_vao;

import java.util.Scanner;

public class HamBatNhapLaiSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * Đoạn code yêu cầu người dùng nhập điểm cho đến khi đúng định dạng.
         * Sử dụng Exception InvalidNumberException tự tạo.
         * Điểm: double score
         */
        double score;
        while (true) {
            try {
                System.out.print("Mời bạn nhập điểm: ");
                score = Double.parseDouble(scanner.nextLine());
                if (score < 0 || score > 100) {
                    throw new InvalidNumberException("Điểm phải lớn hơn hoặc bằng không và bé hơn hoặc bằng 100.\n" +
                            "Vui lòng nhập lại. ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số. Vui lòng nhập lại.");
            } catch (InvalidNumberException p) {
                System.err.println(p.getMessage());
            } catch (Exception e) {

            }

        }

        /**
         * Đoạn code yêu cầu người dùng nhập số lượng phần tử của mảng.
         * Sử dụng Exception InvalidNumberException tự tạo.
         * length: int length
         */
        int length;
        while (true) {
            try {
                System.out.print("Mời bạn nhập số lượng phần tử của mảng: ");
                length = Integer.parseInt(scanner.nextLine());
                if (length < 0 || length > 100) {
                    throw new InvalidNumberException("Số lượng phần tử của mảng phải > 0 và <= 20.\n" +
                            "Vui lòng nhập lại. ");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Bạn nhập không phải là số. Vui lòng nhập lại.");
            } catch (InvalidNumberException p) {
                System.err.println(p.getMessage());
            } catch (Exception e) {

            }

        }
    }
}
