package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class GCD {
    private static final String DEST = "Find the greatest common divisor of given numbers.";

    public static void getGCD() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        Random rd = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {

            int num1 = rd.nextInt(101);
            int num2 = rd.nextInt(101);

            qAndA[i][Engine.QUESTION] = "" + num1 + " " + num2;
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
