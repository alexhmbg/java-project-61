package hexlet.code;

public class Utils {
    private static final int MIN_DEFAULT_RANGE = 1;
    private static final int MAX_DEFAULT_RANGE = 100;

    public static int randomNumber() {
        return MIN_DEFAULT_RANGE + (int) (Math.random() * ((MAX_DEFAULT_RANGE - MIN_DEFAULT_RANGE) + 1));
    }
    public static int randomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
