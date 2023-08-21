package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;


public class GCD {
    private static final String DEST = "Find the greatest common divisor of given numbers.";
    private static final int MAX_NUMBER = 101;

    public static void getGCD() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {

            int num1 = Util.getRandom(MAX_NUMBER);
            int num2 = Util.getRandom(MAX_NUMBER);

            qAndA[i][Engine.QUESTION] = num1 + " " + num2;
            qAndA[i][Engine.ANSWER] = "" + calcGCD(num1, num2);
        }
        Engine.engine(DEST, qAndA);
    }

    public static int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
