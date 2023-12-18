package hexlet.code;

public class Utils {
    private static final int defaultMinRange = 1;
    private static final int defaultMaxRange = 100;

    public static int randomNumber() {
        return defaultMinRange + (int) (Math.random() * ((defaultMaxRange - defaultMinRange) + 1));
    }
    public static int randomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
