package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static int rounds = Engine.gameRounds;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            int randomNum1 = Utils.randomNumber(1, 100);
            int randomNum2 = Utils.randomNumber(1, 100);
            char randomOperator = randomOperator();
            questions[i] = randomNum1 + " " + randomOperator + " " + randomNum2;
            answers[i] = String.valueOf(operation(randomNum1, randomNum2, randomOperator));
        }

        Engine.runGame(questions, answers, description);
    }

    public static char randomOperator() {
        char[] operators = {'-', '+', '*'};
        return operators[Utils.randomNumber(0, 2)];
    }

    public static int operation(int num1, int num2, char operator) {
        return switch (operator) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            default -> num1 * num2;
        };
    }
}
