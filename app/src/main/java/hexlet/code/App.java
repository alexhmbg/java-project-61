package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] choices = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "6 - Prime", "0 - Exit"};

        for (var choice : choices) {
            System.out.println(choice);
        }

        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            menu(String.valueOf(scanner.nextInt()));
        } else {
            menu(String.valueOf(0));
        }
    }

    public static void menu(String choice) {
        switch (choice) {
            case "0":
                break;
            case "1":
                Greet.start();
                break;
            case "2":
                Even.start();
                break;
            case "3":
                Calc.start();
                break;
            case "4":
                GCD.start();
                break;
            case "5":
                Progression.start();
                break;
            case "6":
                Prime.start();
            default:
                break;
        }
    }
}
