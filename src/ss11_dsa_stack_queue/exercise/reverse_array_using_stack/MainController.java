package ss11_dsa_stack_queue.exercise.reverse_array_using_stack;

import java.util.Arrays;

public class MainController {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 4, 5, 6};
        System.out.println("Before reverse: Array = " + Arrays.toString(array));
        ReverseArrayByStack.reverseArray(array);
        System.out.println("After reverse: Array = " + Arrays.toString(array));

        String str = "Hello World";
        System.out.println("Before reverse: String = " + str);
        str = ReverseArrayByStack.reverseString(str);
        System.out.println("After reverse: String = " + str);
    }
}
