package hexlet.code;

import java.util.Random;

public class Util {
    public static int getRandom(int upperLimit) {
        Random random = new Random();
        return random.nextInt(upperLimit);
    }

    public static int getRandom(int lowerLimit, int upperLimit) {
        Random random = new Random();
        return random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
    }
}

