package ss13_search_algorithm.exercise.binary_search_use_recursion;

public class BinarySearchByRecursion {

    /**
     * Tìm kiếm nhị phân sử dụng đệ quy.
     * B1: Sắp xếp. B2: Tìm kiếm
     *
     * @param array Mảng (chưa sắp xếp)
     * @param value Giá trị cần tìm vị trí
     * @param left  Vị trí đầu mảng (0)
     * @param right Vị trí cuối mảng.
     */
    public static int binarySearch(int[] array, int value, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        if (value == array[mid] ) {
            return mid;
        }
        if (value > array[mid]) {
            return binarySearch(array, value, mid + 1, right);
        } else {
            return binarySearch(array, value, left, mid - 1);
        }
    }

}
