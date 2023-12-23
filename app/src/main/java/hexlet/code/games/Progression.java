package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int ROUNDS = Engine.GAME_ROUNDS;
    private static final String DESCRIPTION = "What number is missing in the progression?";
    private static final String[][] QA = new String[ROUNDS][2];
    private static final int LENGTH_OF_LINE = 10;
    private static final int MIN_PROGRESSION_STEP = 2;
    private static final int MAX_PROGRESSION_STEP = 5;

    public static void start() {
        for (var i = 0; i < ROUNDS; i++) {
            int[] progression = makeProgression();
            int randomIndex = Utils.randomNumber(0, LENGTH_OF_LINE - 1);
            QA[i][0] = switchNum(progression, randomIndex);
            QA[i][1] = String.valueOf(progression[randomIndex]);
        }
        Engine.runGame(QA, DESCRIPTION);
    }

    public static int[] makeProgression() {
        int[] progression = new int[LENGTH_OF_LINE];
        int firstNum = Utils.randomNumber();
        int progressionStep = Utils.randomNumber(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        for (var i = 0; i < progression.length; i++) {
            progression[i] = firstNum + (i * progressionStep);
        }

        return progression;
    }

    public static String switchNum(int[] progression, int index) {
        String[] questionLine = new String[progression.length];
        for (var i = 0; i < progression.length; i++) {
            if (i == index) {
                questionLine[i] = "..";
            } else {
                questionLine[i] = String.valueOf(progression[i]);
            }
        }

        return String.join(" ", questionLine);
    }
}
