package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final int ROUNDS = Engine.GAME_ROUNDS;
    private static final String DESCRIPTION = "What is the result of the expression?";
    private static final String[][] QA = new String[ROUNDS][2];
    private static final char[] OPERATORS = {'-', '+', '*'};

    public static void start() {
        for (var i = 0; i < ROUNDS; i++) {
            int randomNum1 = Utils.randomNumber();
            int randomNum2 = Utils.randomNumber();
            char randomOperator = OPERATORS[Utils.randomNumber(0, OPERATORS.length - 1)];
            QA[i][0] = randomNum1 + " " + randomOperator + " " + randomNum2;
            QA[i][1] = String.valueOf(calculate(randomNum1, randomNum2, randomOperator));
        }

        Engine.runGame(QA, DESCRIPTION);
    }

    public static int calculate(int num1, int num2, char operator) {
        return switch (operator) {
            case '-' -> num1 - num2;
            case '+' -> num1 + num2;
            case '*' -> num1 * num2;
            default -> throw new RuntimeException("There's no logic behind '" + operator + "' operator");
        };
    }
}
