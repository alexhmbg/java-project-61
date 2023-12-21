package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String description = "What number is missing in the progression?";
    private static int rounds = Engine.GAME_ROUNDS;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];
    private static final int LENGTH_OF_LINE = 10;
    private static final int MIN_PROGRESSION_STEP = 2;
    private static final int MAX_PROGRESSION_STEP = 5;
    private static int[] numbersLine = new int[LENGTH_OF_LINE];
    private static int savedProgressionNum;

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            questions[i] = createProgressionLine();
            answers[i] = String.valueOf(savedProgressionNum);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String createProgressionLine() {
        int progressionStep = Utils.randomNumber(MIN_PROGRESSION_STEP, MAX_PROGRESSION_STEP);
        int randomIndex = Utils.randomNumber(0, LENGTH_OF_LINE - 1);
        makeProgression(progressionStep, LENGTH_OF_LINE);
        return switchRandomNum(numbersLine, randomIndex);
    }

    public static void makeProgression(int step, int length) {
        var firstNumber = Utils.randomNumber();
        for (var i = 0; i < length; i++) {
            numbersLine[i] = firstNumber + (i * step);
        }
    }

    public static String switchRandomNum(int[] numbers, int randomIndex) {
        savedProgressionNum = numbers[randomIndex];
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
