package ss11_dsa_stack_queue.exercise.reverse_array_using_stack;

import java.util.Stack;

public class ReverseArrayByStack {

    public static void reverseArray(int[] arr) {
        Stack<Integer> reverseArray = new Stack<>();

        //Ghi phần tử vào stack
        for (int number :
                arr) {
            reverseArray.push(number);
        }

        //Đảo ngược và ghi vào mảng ban đầu
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseArray.pop();
        }
    }

    public static String reverseString(String str) {
        Stack<Character> reverseString = new Stack<>();

        //Ghi từng chữ cái vào stack
        for (int i = 0; i < str.length(); i++) {
            reverseString.push(str.charAt(i));
        }

        String newStr = "";
        //Đảo ngược và ghi vào chuỗi ban đầu
        for (int i = 0; i < str.length(); i++) {
            newStr += reverseString.pop();
        }
        return newStr;
    }
}
