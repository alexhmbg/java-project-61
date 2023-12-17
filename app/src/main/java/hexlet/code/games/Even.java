package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.Scanner;

public class GameEven {
	public static void start() {
		var description = "Answer 'yes' if the number is even, otherwise answer 'no'.";
		for(var currentRound = 0; currentRound < Engine.gameRounds; currentRound++) {
			Utils.randomNumbers(1, 100, 1);
			var question = Integer.toString(Utils.randomNumbers[0]);
			String correctAnswer = Integer.parseInt(question) % 2 == 0 ? "yes" : "no";
			//Engine.gameRules(description, question, correctAnswer, currentRound, Engine.gameRounds);
		}
	}
}
