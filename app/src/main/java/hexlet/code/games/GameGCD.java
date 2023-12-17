package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
	public static void start() {
		var description = "Find the greatest common divisor of given numbers.";
		int gameRounds = 3;
		for(var currentRound = 0; currentRound < gameRounds; currentRound++) {
			Engine.randomNumbers(1, 100, 2);
			var question = Engine.randomNumbers[0] + " " + Engine.randomNumbers[1];
			String correctAnswer = Integer.toString(Engine.GCD(Engine.randomNumbers[0], Engine.randomNumbers[1]));
			Engine.gameRules(description, question, correctAnswer, currentRound, gameRounds);
		}
	}
}
