package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
	public static String description = "Find the greatest common divisor of given numbers.";
	public static int rounds = Engine.gameRounds;
	public static String[] questions = new String[rounds];
	public static String[] answers = new String[rounds];

	public static void start() {
		for(var i = 0; i < rounds; i++) {
			int randomNum1 = Utils.randomNumber(1, 100);
			int randomNum2 = Utils.randomNumber(1, 100);
			questions[i] = randomNum1 + " " + randomNum2;
			answers[i] = String.valueOf(GCD(randomNum1, randomNum2));
		}

		Engine.runGame(questions, answers, description);
	}

	public static int GCD(int num1, int num2) {
		var first = num1;
		var second = num2;
		var remainder = first % second;
		boolean isFinalGCD = false;
		while (!isFinalGCD) {
			if (first % second != 0) {
				remainder = first % second;
				first = second;
				second = remainder;
			} else {
				remainder = second;
				isFinalGCD = true;
			}
		}
		return remainder;
	}
}
