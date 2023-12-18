package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    public static String description = "What number is missing in the progression?";
    public static int rounds = Engine.gameRounds;
    public static String[] questions = new String[rounds];
    public static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            progressionLines(i);
        }

        Engine.runGame(questions, answers, description);
    }

    public static void progressionLines(int loopCount) {
        StringBuilder questionsLine = new StringBuilder();
        StringBuilder answersLine = new StringBuilder();
        int lineLength = Utils.randomNumber(6, 10);
        int savedNumber = Utils.randomNumber(1, 50);
        int lineProgression = Utils.randomNumber(2, 5);
        int replaceIndex = Utils.randomNumber(0, lineLength - 1);

        for (var i = 0; i < lineLength; i++) {
            if (i == replaceIndex) {
                questionsLine.append("..");
                savedNumber = savedNumber + lineProgression;
                answersLine.append(savedNumber);
                if (i != lineLength - 1) {
                    questionsLine.append(" ");
                }
            } else if (i == 0) {
                questionsLine.append(savedNumber);
                questionsLine.append(" ");
            } else if (i == lineLength - 1) {
                questionsLine.append(savedNumber + lineProgression);
            } else {
                questionsLine.append(savedNumber + lineProgression);
                savedNumber = savedNumber + lineProgression;
                questionsLine.append(" ");
            }
        }

        questions[loopCount] = questionsLine.toString();
        answers[loopCount] = answersLine.toString();
    }
}
