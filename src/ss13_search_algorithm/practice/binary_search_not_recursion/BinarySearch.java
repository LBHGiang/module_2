package ss13_search_algorithm.practice.binary_search_not_recursion;

public class BinarySearch {
    public static int binarySearch(int[] array, int number) {
        int first = 0;
        int last = array.length - 1;
        int mid;

        while (first <= last) {
            mid = (first + last) / 2;
            if (number == array[mid]) {
                return mid;
            }
            if (number > array[mid]) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        return -1;
    }
}
