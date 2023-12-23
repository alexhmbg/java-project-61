package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final int ROUNDS = Engine.GAME_ROUNDS;
    private static final String DESCRIPTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final String[][] QA = new String[ROUNDS][2];

    public static void start() {
        for (var i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.randomNumber();
            QA[i][0] = String.valueOf(randomNum);
            QA[i][1] = isPrime(randomNum) ? "yes" : "no";
        }

        Engine.runGame(QA, DESCRIPTION);
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
