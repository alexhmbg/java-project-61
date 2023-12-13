package hexlet.code;

import java.util.Scanner;

public class GameEven {
	public static void start() {
		String playerName = GameGreet.start();

		System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
		int questionIndex = 0;
		while (questionIndex < 3) {
			int Min = 1;
			int Max = 100;
			int randomNum = Min + (int)(Math.random() * ((Max - Min) + 1));
			System.out.println("Question: " + randomNum);
			String correctAnswer = randomNum % 2 == 0 ? "yes" : "no";

			System.out.print("Your answer: ");
			Scanner answerScanner = new Scanner(System.in);
			String playerAnswer = answerScanner.nextLine();

			boolean bothCorrect = playerAnswer.equals(correctAnswer);

			if (bothCorrect) {
				System.out.println("Correct!");
				if (questionIndex == 2) {
					System.out.println("Congratulations, " + playerName + "!");
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
