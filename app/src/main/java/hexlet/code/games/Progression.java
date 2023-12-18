package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String description = "What number is missing in the progression?";
    private static int rounds = Engine.getRounds();
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];
    private static int lineLength = 10;
    private static int minDifference = 2;
    private static int maxDifference = 5;
    public static void start() {
        for (var i = 0; i < rounds; i++) {
            questions[i] = progressionLine(i);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String progressionLine(int index) {
        int numProgression = Utils.randomNumber(minDifference, maxDifference);
        int randomIndex = Utils.randomNumber(0, lineLength - 1);

        int[] numbersLine = new int[lineLength];
        numbersLine[0] = Utils.randomNumber();

        for (var i = 1; i < lineLength; i++) {
            numbersLine[i] = numbersLine[i - 1] + numProgression;
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
