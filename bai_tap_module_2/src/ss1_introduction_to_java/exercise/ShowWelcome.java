package ss1_introduction_to_java.exercise;

import java.util.Scanner;

public class ShowWelcome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String name = scanner.nextLine();
        System.out.println("Xin chào " + name);
    }
}
