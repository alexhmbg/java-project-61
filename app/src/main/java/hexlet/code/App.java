package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        String[] choices = {"1 - Greet", "2 - Even", "3 - Calc", "4 - GCD", "5 - Progression", "0 - Exit"};

        for (var choice : choices) {
                System.out.println(choice);
        }

        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        menu(scanner.nextInt());
    }

    public static void menu(int choice) {
        switch (choice) {
            case 0:
                break;
            case 1:
                Greet.start();
                break;
            case 2:
                Even.start();
                break;
            case 3:
                Calc.start();
                break;
            case 4:
                GCD.start();
                break;
            case 5:
                Progression.start();
                break;
        }
    }
}
