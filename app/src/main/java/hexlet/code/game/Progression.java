package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Progression {
    private static final String DEST = "What number is missing in the progression?";
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_DIFFERENCE = 10;


    public static void getProgression() {
        String[][] qAndA = new String[Engine.ROUNDS][2];
        Random random = new Random();

        int progressionLength = Util.getRandom(MIN_LENGTH, MAX_LENGTH);
        int index = random.nextInt(progressionLength);
        int hiddenNumber = 0;

        for (int i = 0; i < Engine.ROUNDS; i++) {
            qAndA[i] = new String[2];
            int firstNumber = random.nextInt(MAX_NUMBER);
            int difference = random.nextInt(MAX_DIFFERENCE) + 1;

            StringBuilder progression = new StringBuilder();
            for (int j = 0; j < progressionLength; j++) {
                if (j == index) {
                    progression.append(".. ");
                    hiddenNumber = firstNumber;
                } else {
                    progression.append(firstNumber).append(" ");
                }
                firstNumber += difference;
            }
            String progressionString = progression.toString();

            qAndA[i][Engine.QUESTION] = progressionString;
            qAndA[i][Engine.ANSWER] = String.valueOf(hiddenNumber);
        }
        Engine.engine(DEST, qAndA);
    }
}
