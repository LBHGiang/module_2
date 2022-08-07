package test.method;

public class timMaxMang2Chieu {
    //Tìm max mảng 2 chiều, tham số là mảng 2 chiều -> xuất ra max và tọa độ. Không return
    public static void findTheLargestElementInATwoDimensionalArray(int[][] arr) {

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.printf("Max = %d \n", max);

        System.out.println("Max of index:\n");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (max == arr[i][j]) {
                    System.out.printf("[%d][%d]\t", i, j);

                }
            }
        }


    }
}
