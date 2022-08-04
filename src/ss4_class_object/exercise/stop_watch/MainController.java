package ss4_class_object.exercise.stop_watch;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        int[] array = {1,35,7,4,12,76,12,54,6756,234,123,564,34,234,2634,53425,436};
        StopWatch stopWatch1 = new StopWatch();

        //start
        System.out.println(stopWatch1.start());

        //sort array
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] < array[j]){
                    int x = array[i];
                    array[i] = array[j];
                    array[j] = x;
                }
            }
        }
        //display array
        System.out.println(Arrays.toString(array));

        //end
        System.out.println(stopWatch1.stop());

        //display Elapsed Time
        System.out.println(stopWatch1.getElapsedTime());

    }
}
