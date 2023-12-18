package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static String description = "Find the greatest common divisor of given numbers.";
    private static int rounds = Engine.gameRounds;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            int min = 1;
            int max = 100;
            int randomNum1 = Utils.randomNumber(min, max);
            int randomNum2 = Utils.randomNumber(min, max);
            questions[i] = randomNum1 + " " + randomNum2;
            answers[i] = String.valueOf(findGCD(randomNum1, randomNum2));
        }

        Engine.runGame(questions, answers, description);
    }

    public static int findGCD(int num1, int num2) {
        var first = num1;
        var second = num2;
        var remainder = first % second;
        boolean isFinalGCD = false;
        while (!isFinalGCD) {
            if (first % second != 0) {
                remainder = first % second;
                first = second;
                second = remainder;
            } else {
                remainder = second;
                isFinalGCD = true;
            }
        }
        return remainder;
    }
}
