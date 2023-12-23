package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final int ROUNDS = Engine.GAME_ROUNDS;
    private static final String DESCRIPTION = "Find the greatest common divisor of given numbers.";
    private static final String[][] QA = new String[ROUNDS][2];


    public static void start() {
        for (var i = 0; i < ROUNDS; i++) {
            int randomNum1 = Utils.randomNumber();
            int randomNum2 = Utils.randomNumber();
            QA[i][0] = randomNum1 + " " + randomNum2;
            QA[i][1] = String.valueOf(findGCD(randomNum1, randomNum2));
        }

        Engine.runGame(QA, DESCRIPTION);
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
