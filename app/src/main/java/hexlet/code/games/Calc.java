package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static String description = "What is the result of the expression?";
    private static int rounds = Engine.GAME_ROUNDS;
    private static String[] questions = new String[rounds];
    private static String[] answers = new String[rounds];
    private static char[] operators = {'-', '+', '*'};
    private static int operation;

    public static void start() {
        for (var i = 0; i < rounds; i++) {
            questions[i] = createQuestionString();
            answers[i] = String.valueOf(operation);
        }

        Engine.runGame(questions, answers, description);
    }

    public static String createQuestionString() {
        int randomNum1 = Utils.randomNumber();
        int randomNum2 = Utils.randomNumber();
        char randomOperator = operators[Utils.randomNumber(0, operators.length - 1)];
        calculate(randomNum1, randomNum2, randomOperator);

        String finalStr = randomNum1 + " " + randomOperator + " " + randomNum2;
        return finalStr;
    }

    public static void calculate(int num1, int num2, char operator) {
        switch (operator) {
            case '-':
                operation = num1 - num2;
                break;
            case '+':
                operation = num1 + num2;
                break;
            case '*':
                operation = num1 * num2;
                break;
            default:
                System.out.println("There's no logic behind '" + operator + "' operator");
                break;
        }
    }
}
