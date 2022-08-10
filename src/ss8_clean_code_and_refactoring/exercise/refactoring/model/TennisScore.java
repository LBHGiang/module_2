package ss8_clean_code_and_refactoring.exercise.refactoring.model;

import java.util.Scanner;

public class TennisScore extends TennisGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Score of player1");
        int player1Score = Integer.parseInt(scanner.nextLine());

        System.out.println("Score of play2");
        int player2Score = Integer.parseInt(scanner.nextLine());

        System.out.println(readScore("Giang", "Trường",
                player1Score, player2Score));

    }
}
