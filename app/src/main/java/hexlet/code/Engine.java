package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int GAME_ROUNDS = 3;

    public static void runGame(String[] questions, String[] answers, String description) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        var playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(description);

        var score = 0;
        for (var i = 0; i < GAME_ROUNDS; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner answerScanner = new Scanner(System.in);
            String playerAnswer = answerScanner.nextLine();
            String correctAnswer = answers[i];
            boolean isCorrect = playerAnswer.equals(answers[i]);

            if (isCorrect) {
                System.out.println("Correct!");
                score++;
            } else {
                String wrongPlayerAnswer = "'" + playerAnswer + "' is wrong answer ;(. ";
                String correctGameAnswer = "Correct answer was '" + correctAnswer + "'.";
                System.out.println(wrongPlayerAnswer + correctGameAnswer);
                System.out.println("Let's try again, " + playerName + "!");
                break;
            }
        }

        if (score == GAME_ROUNDS) {
            System.out.println("Congratulations, " + playerName + "!");
        }
    }
}
