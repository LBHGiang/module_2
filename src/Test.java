import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Test {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        String str = "abcd";
        System.out.println(str);

        queue.add(str.charAt(0));
        queue.add(str.charAt(1));
        queue.add(str.charAt(2));
        System.out.println(queue);

        queue.remove();
        System.out.println(queue);




    }
}

