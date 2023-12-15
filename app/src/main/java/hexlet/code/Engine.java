package hexlet.code;

import java.util.Scanner;

public class Engine {
	public static int randomNumber() {
		// generate and return number
		int Min = 1;
		int Max = 100;
		return Min + (int) (Math.random() * ((Max - Min) + 1));
	}
}
