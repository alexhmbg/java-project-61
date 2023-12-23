package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int ROUNDS = Engine.GAME_ROUNDS;
    private static final String DESCRIPTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";;
    private static final String[][] QA = new String[ROUNDS][2];

    public static void start() {
        for (var i = 0; i < ROUNDS; i++) {
            int randomNum = Utils.randomNumber();
            QA[i][0] = String.valueOf(randomNum);
            QA[i][1] = isEven(randomNum) ? "yes" : "no";
        }

        Engine.runGame(QA, DESCRIPTION);
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}
