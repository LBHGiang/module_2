package ss11_dsa_stack_queue.exercise.check_brackets_in_expressions_using_stack;

import java.util.Stack;

public class StackCheckBrackets {

    public static Boolean checkBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            }
            if (str.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
