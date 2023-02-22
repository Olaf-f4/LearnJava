package Section5;

public class MethodOverloading {
    public static void main(String[] args) {

        int year = 1700;
        boolean solution = year % 400 == 0;
        System.out.println(solution);

        int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {

        System.out.println("Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int calculateScore(int score) {

        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }
    public static int calculateScore() {

        System.out.println("No player name, no player score");
        return 0;
    }
}