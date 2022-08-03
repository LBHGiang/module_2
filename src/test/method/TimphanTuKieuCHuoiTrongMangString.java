package test.method;

public class TimphanTuKieuCHuoiTrongMangString {

    //Phương thức nhận 1 mảng các string và 1 chuỗi.
    // Tìm xem chuỗi tồn tại trong mảng không và đưa ra vị trí.
    // Hàm xuất ra kết quả chứ không trả về giá trị

    public static void getTheIndexOfElement(String[] arr, String str) {
        for (int i = 0; i < arr.length; i++) {
            if (str.equals(arr[i])) {
                System.out.printf("Position of the element '%s' in the list is %d", str, i);
                return;
            }
        }
        System.out.printf("Not found '%s' in the list.", str);
    }

}
