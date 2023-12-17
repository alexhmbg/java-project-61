package hexlet.code;

import hexlet.code.games.Greet;

import java.util.Scanner;

public class Engine {
	public static int[] randomNumbers;
	public static char randomOperator;
	public static boolean gameOver = false;

	public static void gameRules(String gameDescription, String question, String correctAnswer, int currentRound, int gameRounds) {
		if (currentRound == 0) {
			Greet.start();
			System.out.println(gameDescription);
		}
		if (!gameOver) {
			System.out.println("Question: " + question);
			System.out.print("Your answer: ");
			Scanner answerScanner = new Scanner(System.in);
			String playerAnswer = answerScanner.nextLine();
			isCorrect(correctAnswer, playerAnswer, currentRound, gameRounds);
		}
	}
	public static int randomNumber(int min, int max) {
		return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static void randomNumbers(int min, int max, int amount) {
		int[] randomNumbers = new int[amount];
		for(var i = 0; i < amount; i++) {
			randomNumbers[i] = randomNumber(min, max);
		}
		Engine.randomNumbers = randomNumbers;
	}

	public static void randomOperator() {
		char[] operators = {'-', '+', '*'};
		randomOperator = operators[randomNumber(0, 2)];
	}

	public static int randomOperation(int num1, int num2, char operator) {
		return switch (operator) {
			case '-' -> num1 - num2;
			case '+' -> num1 + num2;
			default -> num1 * num2;
		};
	}

	public static int GCD(int randomNumber1, int randomNumber2) {
		var num1 = randomNumber1;
		var num2 = randomNumber2;
		var remainder = num1 % num2;
		boolean isFinalGCD = false;
		while (!isFinalGCD) {
			if (num1 % num2 != 0) {
				remainder = num1 % num2;
				num1 = num2;
				num2 = remainder;
			} else {
				remainder = num2;
				isFinalGCD = true;
			}
		}
		return remainder;
	}

	public static void isCorrect(String correctAnswer, String playerAnswer, int currentRound, int gameRounds) {
		var isCorrect = playerAnswer.equals(correctAnswer);
		if (isCorrect && currentRound == gameRounds - 1) {
			System.out.println("Correct!");
			System.out.println("Congratulations, " + Greet.playerName + "!");
		} else if (isCorrect) {
			System.out.println("Correct!");
		} else {
			String wrongPlayerAnswer = "'" + playerAnswer + "' is wrong answer ;(. ";
			String correctGameAnswer = "Correct answer was '" + correctAnswer + "'.";
			System.out.println(wrongPlayerAnswer + correctGameAnswer);
			System.out.println("Let's try again, " + Greet.playerName + "!");
			gameOver = true;
		}
	}
}
