package hexlet.code;

public class Utils {
    private static int defaultMinRange;
    private static int defaultMaxRange;
    Utils() {
        this.defaultMinRange = 1;
        this.defaultMaxRange = 100;
    }

    public static int randomNumber() {
        return defaultMinRange + (int) (Math.random() * ((defaultMaxRange - defaultMinRange) + 1));
    }
    public static int randomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
