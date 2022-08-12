package ss8_clean_code_and_refactoring.exercise.refactoring.model;

public class TennisGame {

    private static final int LOVE = 0;
    private static final int FIFTEEN = 1;
    private static final int THIRTY = 2;
    private static final int FORTY = 3;
    public static final int ADVANTAGE_FOR_PLAYER1 = 1;
    public static final int ADVANTAGE_FOR_PLAYER2 = -1;
    public static final int WIN_FOR_PLAYER1 = 2;
    public static final int WIN_FOR_PLAYER2 = -2;

    public static String readScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        System.out.println(player1Name + " - " + player2Name);

        boolean isEqual = player1Score == player2Score;

        if (isEqual) {
            return readEqualScore(player1Score);
        }

        boolean isAdvantage = player1Score + player2Score >= 7;
        if (isAdvantage) {
            return readAdvantageScore(player1Name, player2Name, player1Score, player2Score);
        }

        String score = "";
        score += readEachPlayerScore(player1Score) + " - " + readEachPlayerScore(player2Score);
        return score;
    }

    public static String readEachPlayerScore(int score) {
        switch (score) {
            case LOVE:
                return "Love";
            case FIFTEEN:
                return "Fifteen";
            case THIRTY:
                return "Thirty";
            case FORTY:
                return "Forty";
            default:
                return "-1";
        }
    }

    public static String readAdvantageScore(String player1Name, String player2Name, int player1Score, int player2Score) {
        int advantageScore = player1Score - player2Score;

        switch (advantageScore) {
            case ADVANTAGE_FOR_PLAYER1:
                return "Advantage for " + player1Name;
            case ADVANTAGE_FOR_PLAYER2:
                return "Advantage for " + player2Name;
            case WIN_FOR_PLAYER1:
                return "Win for " + player1Name;
            case WIN_FOR_PLAYER2:
                return "Win for " + player2Name;
            default:
                return "The match was over";
        }
    }

    public static String readEqualScore(int player1Score) {
        return readEachPlayerScore(player1Score) + "- All";
    }

}

