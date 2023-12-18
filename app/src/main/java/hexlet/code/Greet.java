package hexlet.code;

import java.util.Scanner;

public class Greet {
    private static String playerName;
    public static void start() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        playerName = scanner.nextLine();
        System.out.println("Hello, " + playerName + "!");
    }

    static String getName() {
        return playerName;
    }
}
