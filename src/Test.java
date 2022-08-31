import java.util.*;

class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("6");
        set.add("5");
        set.add("4");
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        queue.add("2");
        queue.add("3");
        System.out.println(queue);
        System.out.println(set);
//        queue.addAll(set);
        System.out.println(queue.remove());

    }
}