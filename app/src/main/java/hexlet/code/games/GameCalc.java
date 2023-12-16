package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class GameCalc {
	public static void start() {
		var description = "What is the result of the expression?";
		int gameRounds = 3;
		for(var currentRound = 0; currentRound < gameRounds; currentRound++) {
			Engine.randomOperator();
			Engine.randomNumbers(1, 100, 2);
			var question = Engine.randomNumbers[0] + " " + Engine.randomOperator + " " + Engine.randomNumbers[1];
			String correctAnswer = Integer.toString(Engine.randomOperation(Engine.randomNumbers[0], Engine.randomNumbers[1], Engine.randomOperator));
			Engine.gameRules(description, question, correctAnswer, currentRound, gameRounds);
		}
	}
}
