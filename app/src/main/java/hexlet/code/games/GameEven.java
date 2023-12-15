package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameEven {
	public static void start() {
		GameGreet.start();
		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

		int questionIndex = 0;
		while (questionIndex < 3) {
			int randomNum = Engine.randomNumber();

			System.out.println("Question: " + randomNum);
			System.out.print("Your answer: ");
			Scanner answerScanner = new Scanner(System.in);
			String playerAnswer = answerScanner.nextLine();
			String correctAnswer = randomNum % 2 == 0 ? "yes" : "no";
			boolean bothCorrect = playerAnswer.equals(correctAnswer);

			if (bothCorrect) {
				System.out.println("Correct!");
				if (questionIndex == 2) {
					System.out.println("Congratulations, " + GameGreet.playerName + "!");
				}
				questionIndex++;
			} else {
				String wrongPlayerAnswer = "'" + playerAnswer + "' is wrong answer ;(. ";
				String correctGameAnswer = "Correct answer was '" + correctAnswer + "'.";
				System.out.println(wrongPlayerAnswer + correctGameAnswer);
				break;
			}
		}
	}
}
