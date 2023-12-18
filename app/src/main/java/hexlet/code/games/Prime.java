package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static String description = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static String[] questions = new String[Engine.gameRounds];
    private static String[] answers = new String[Engine.gameRounds];

    public static void start() {
        for (var i = 0; i < Engine.gameRounds; i++) {
            int min = 1;
            int max = 100;
            int randomNum = Utils.randomNumber(min, max);
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
