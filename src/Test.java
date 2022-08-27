import java.util.Scanner;

class Test {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("d=");
        run();

    }
    public static void run(){
        double d = Double.parseDouble(scanner.nextLine());
        System.out.println(d);
    }
}