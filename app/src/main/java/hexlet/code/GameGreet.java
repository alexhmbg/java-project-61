package hexlet.code;

import java.util.Scanner;

public class GameGreet {
	public static String start() {
		System.out.println("\nWelcome to the Brain Games!");
		System.out.print("May I have your name? ");
		Scanner scanner = new Scanner(System.in);
		String playerName = scanner.nextLine();
		System.out.println("Hello, " + playerName + "!");
		return playerName;
	}
}
