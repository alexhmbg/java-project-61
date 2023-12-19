package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String description = "What number is missing in the progression?";
    private static int rounds = Engine.getRounds();
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];
    private static final int LENGTH_OF_LINE = 10;
    private static final int MIN_PROGRESSION_RANGE = 2;
    private static final int MAX_PROGRESSION_RANGE = 5;
    public static void start() {
        for (var i = 0; i < rounds; i++) {
            questions[i] = progressionLine(i);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String progressionLine(int index) {
        int lineProgression = Utils.randomNumber(MIN_PROGRESSION_RANGE, MAX_PROGRESSION_RANGE);
        int randomIndex = Utils.randomNumber(0, LENGTH_OF_LINE - 1);

        int[] numbersLine = new int[LENGTH_OF_LINE];
        numbersLine[0] = Utils.randomNumber();

        for (var i = 1; i < LENGTH_OF_LINE; i++) {
            numbersLine[i] = numbersLine[i - 1] + lineProgression;
        }

        answers[index] = String.valueOf(numbersLine[randomIndex]);
        return switchRandomNum(numbersLine, randomIndex);
    }

    public static String switchRandomNum(int[] numbers, int randomIndex) {
        String[] questionLine = new String[numbers.length];

        for (var i = 0; i < numbers.length; i++) {
            if (i == randomIndex) {
                questionLine[i] = "..";
            } else {
                questionLine[i] = String.valueOf(numbers[i]);
            }
        }

        return String.join(" ", questionLine);
    }
}
