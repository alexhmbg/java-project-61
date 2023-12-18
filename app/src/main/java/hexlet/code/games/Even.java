package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";;
    private static int rounds = Engine.gameRounds;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            int randomNum = Utils.randomNumber(1, 100);
            questions[i] = String.valueOf(randomNum);
            answers[i] = randomNum % 2 == 0 ? "yes" : "no";
        }

        Engine.runGame(questions, answers, description);
    }
}
