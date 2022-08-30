import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> stringList2 = new ArrayList<>();
        stringList.addAll(stringList2);
        System.out.println(stringList);



    }
}