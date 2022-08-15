package ss11_dsa_stack_queue.exercise.convert_from_decimal_to_binary;

import java.util.Stack;

public class StackConvert {
    public static void convertDecimalToBinary(int number) {
        Stack<Integer> stack = new Stack<>();
        while (number != 0) {
            stack.push(number % 2);
            number /= 2;
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
