package bai_tap_lam_them.group_exercise;

public class PrintHollowRhombus {
    public static void main(String[] args) {

        for (int i = -5; i < 6; i++) {
            if (i == 0 || i == -1) {
                continue;
            }
            for (int j = -5; j < 6; j++) {
                if (Math.abs(i) + Math.abs(j) == 6) {
                    System.out.print(Math.abs(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }

        /*
        //Vẽ hình thoi với n là số lớn nhất trong hình thoi, n do người dùng nhập
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n là số lớn nhất trong hình thoi");
        int n = Integer.parseInt(scanner.nextLine()) + 1;

        for (int i = -n; i <= n; i++) {
            if (Math.abs(i) == n||i == 0 || i == -1) {
                continue;
            }
            for (int j = -n; j <= n; j++) {
                if (Math.abs(i) + Math.abs(j) == n) {
                    System.out.print(Math.abs(j));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
         */

    }
}