package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static String description = "What number is missing in the progression?";
    private static int rounds = Engine.gameRounds;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];
    public static void start() {
        for (var i = 0; i < rounds; i++) {
            questions[i] = questionLine(i);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String questionLine(int index) {
        int lineLength = Utils.randomNumber(6, 10);
        int lineProgression = Utils.randomNumber(2, 5);
        int randomIndex = Utils.randomNumber(0, lineLength - 1);
        int[] numbersLine = new int[lineLength];
        numbersLine[0] = Utils.randomNumber(1, 50);

        for (var i = 1; i < lineLength; i++) {
            numbersLine[i] = numbersLine[i - 1] + lineProgression;
        }

        answers[index] = String.valueOf(numbersLine[randomIndex]);
        return prepareQuestionLine(numbersLine, randomIndex);
    }

    public static String prepareQuestionLine(int[] numbers, int randomIndex) {
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
