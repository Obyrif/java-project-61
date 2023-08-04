package hexlet.code;

import java.util.Random;

public class Util {

    public static Random getRandom() {
        Random random = new Random();
        return random;
    }

    public static int getRandomWithUpperLimit(int upperLimit) {
        Random random = new Random();
        return random.nextInt(upperLimit + 1);
    }

    public static int getRandomWithRange(int lowerLimit, int upperLimit) {
        Random random = new Random();
        return random.nextInt(upperLimit - lowerLimit + 1) + lowerLimit;
    }
}

