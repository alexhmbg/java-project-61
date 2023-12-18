package hexlet.code;

public class Utils {
    public static int randomNumber() {
        int defaultMinRange = 1;
        int defaultMaxRange = 100;
        return defaultMinRange + (int) (Math.random() * ((defaultMaxRange - defaultMinRange) + 1));
    }
    public static int randomNumber(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
