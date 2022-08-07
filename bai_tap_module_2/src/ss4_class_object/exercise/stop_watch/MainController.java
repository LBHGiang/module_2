package ss4_class_object.exercise.stop_watch;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        int[] array = new int[10000];
        StopWatch stopWatch1 = new StopWatch();

        //start
        System.out.println(stopWatch1.start());

        //input element
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.floor(Math.random() * 100000 + 1);
        }

        //sort array
        Arrays.sort(array);

        //display array
        System.out.println(Arrays.toString(array));

        //end
        System.out.println(stopWatch1.stop());

        //display Elapsed Time
        System.out.println(stopWatch1.getElapsedTime());

    }
}
