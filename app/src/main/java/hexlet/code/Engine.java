package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int gameRounds = 3;
    public static void runGame(String[] questions, String[] answers, String description) {
        Greet.start();
        System.out.println(description);
        for (var i = 0; i < gameRounds; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            Scanner answerScanner = new Scanner(System.in);
            String playerAnswer = answerScanner.nextLine();
            String correctAnswer = answers[i];
            boolean isCorrect = playerAnswer.equals(answers[i]);

            if (isCorrect && i == gameRounds - 1) {
                System.out.println("Correct!");
                System.out.println("Congratulations, " + Greet.playerName + "!");
            } else if (isCorrect) {
                System.out.println("Correct!");
            } else {
                String wrongPlayerAnswer = "'" + playerAnswer + "' is wrong answer ;(. ";
                String correctGameAnswer = "Correct answer was '" + correctAnswer + "'.";
                System.out.println(wrongPlayerAnswer + correctGameAnswer);
                System.out.println("Let's try again, " + Greet.playerName + "!");
                break;
            }
        }
    }
    public static int getRounds() {
        return gameRounds;
    }
}
