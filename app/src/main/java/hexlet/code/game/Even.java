package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String DEST = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void getEven() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Util.getRandom(MAX_NUMBER) + 1;
            String numberOf = String.valueOf(number);
            String correctAnswer = getEven(number) ? "yes" : "no";

            qAndA[i][Engine.QUESTION] = numberOf;
            qAndA[i][Engine.ANSWER] = correctAnswer;
        }
        Engine.engine(DEST, qAndA);
    }
    public static boolean getEven(int numberEven) {
        return numberEven % 2 == 0;
    }
}
