package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String DEST = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void getPrime() {
        String[][] qAndA = new String[Engine.ROUNDS][2];
        Random random = new Random();

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(MAX_NUMBER); // генерируем число
            String numberOf = String.valueOf(number);

            qAndA[i][Engine.QUESTION] = numberOf;
            qAndA[i][Engine.ANSWER] = isPrimeNumber(number) ? "yes" : "no";
        }
        Engine.engine(DEST, qAndA);
    }

    public static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= number / 2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}
