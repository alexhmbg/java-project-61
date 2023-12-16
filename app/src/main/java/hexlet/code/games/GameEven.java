package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class GameEven {
	public static void start() {
		var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
		int gameRounds = 3;
		for(var currentRound = 0; currentRound < gameRounds; currentRound++) {
			Engine.randomNumbers(1, 100, 1);
			var question = Integer.toString(Engine.randomNumbers[0]);
			String correctAnswer = Integer.parseInt(question) % 2 == 0 ? "yes" : "no";
			Engine.gameRules(description, question, correctAnswer, currentRound, gameRounds);
		}
	}
}
