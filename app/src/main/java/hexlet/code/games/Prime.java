package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static int rounds = Engine.GAME_ROUNDS;
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            int randomNum = Utils.randomNumber();
            questions[i] = String.valueOf(randomNum);
            answers[i] = isPrime(randomNum) ? "yes" : "no";
        }

        Engine.runGame(questions, answers, description);
    }

    public static boolean isPrime(int num) {
        double numSqr = Math.sqrt(num);
        if (num < 2) {
            return false;
        }
        for (var i = 2; i <= numSqr; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
