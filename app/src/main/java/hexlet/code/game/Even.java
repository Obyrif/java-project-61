package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final String DEST = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MAX_NUMBER = 100;

    public static void getEven() {
        Util.getRandom();
        String[][] qAndA = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = Util.getRandom().nextInt(MAX_NUMBER) + 1;
            String numberOf = String.valueOf(number);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            qAndA[i][Engine.QUESTION] = numberOf;
            qAndA[i][Engine.ANSWER] = correctAnswer;
        }
        Engine.engine(DEST, qAndA);
    }
}
