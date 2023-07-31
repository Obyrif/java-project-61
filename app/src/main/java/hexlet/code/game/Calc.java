package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Random;

public class Calc {
    private static final String DEST = "What is the result of the expression?";
    public static final char[] OPERATION = {'+', '-', '*'};
    public static final int MAX_NUMBER = 31;

    public static void getCalc() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        Random rd = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = rd.nextInt(MAX_NUMBER);
            int num2 = rd.nextInt(MAX_NUMBER);
            int numberOperat = Util.random();
            char res = OPERATION[numberOperat];
            int resultOperation = 0;
            switch (res) {
                case '+':
                    resultOperation = num1 + num2;
                    break;
                case '-':
                    resultOperation = num1 - num2;
                    break;
                case '*':
                    resultOperation = num1 * num2;
                    break;
                default:
                    System.out.println("Error");
            }
            String resultOperationOf = String.valueOf(resultOperation);
            qAndA[i][Engine.QUESTION] = num1 + " " + res + " " + num2;
            qAndA[i][Engine.ANSWER] = resultOperationOf;
        }
        Engine.engine(DEST, qAndA);
    }
}
