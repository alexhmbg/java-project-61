package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    public static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    public static int rounds = Engine.gameRounds;
    public static String[] questions = new String[rounds];
    public static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            int randomNum = Utils.randomNumber(1, 100);
            questions[i] = String.valueOf(randomNum);
            answers[i] = isPrime(randomNum);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String isPrime(int num) {
        if (num == 1) {
            return "no";
        }
        for (var i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
