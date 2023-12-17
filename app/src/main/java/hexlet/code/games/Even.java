package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
	public static String description = "Answer 'yes' if the number is even, otherwise answer 'no'.";;
	public static int rounds = Engine.gameRounds;
	public static String[] questions = new String[rounds];
	public static String[] answers = new String[rounds];

	public static void start() {
		for(var i = 0; i < rounds; i++) {
			int randomNum1 = Utils.randomNumber(1, 100);
			questions[i] = String.valueOf(randomNum1);
			answers[i] = randomNum1 % 2 == 0 ? "yes" : "no";
		}

		Engine.runGame(questions, answers, description);
	}
}
