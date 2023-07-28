package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Even {
    private static final String DEST = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void getEven() {
        Random random = new Random();
        String[][] qAndA = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int number = random.nextInt(100) + 1;
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            qAndA[i][Engine.QUESTION] = "" + number;
            qAndA[i][Engine.ANSWER] = correctAnswer;
        }
        Engine.engine(DEST, qAndA);
    }
}
