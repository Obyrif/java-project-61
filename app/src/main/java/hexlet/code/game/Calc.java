package hexlet.code.game;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String DEST = "What is the result of the expression?";
    private static final char[] OPERATION = {'+', '-', '*'};

    public static void getCalc() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        Random rd = new Random();
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = rd.nextInt(31);
            int num2 = rd.nextInt(31);
            int numberOperat = (int) Math.floor(Math.random() * OPERATION.length);
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
            qAndA[i][Engine.QUESTION] = "" + num1 + " " + res + " " + num2;
            qAndA[i][Engine.ANSWER] = "" + resultOperation;
        }
        Engine.engine(DEST, qAndA);
    }
}
