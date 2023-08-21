package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;


public class Calc {
    private static final String DEST = "What is the result of the expression?";
    public static final char[] OPERATION = {'+', '-', '*'};
    public static final int MAX_NUMBER = 31;

    public static void getCalc() {
        String[][] qAndA = new String[Engine.ROUNDS][2];

        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num1 = Util.getRandom(MAX_NUMBER);;
            int num2 = Util.getRandom(MAX_NUMBER);;
            char operation = getRandomOperation();
            int result = calculate(num1, num2, operation);
            String resultOperationOf = String.valueOf(result);
            qAndA[i][Engine.QUESTION] = generateQuestion(num1, num2, operation);
            qAndA[i][Engine.ANSWER] = resultOperationOf;
        }
        Engine.engine(DEST, qAndA);
    }
    private static char getRandomOperation() {
        int randomIndex = Util.getRandom(OPERATION.length - 1);
        return OPERATION[randomIndex];
    }
    public static int calculate(int num1, int num2, char operation) {
        int result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            default:
                System.out.println("Error");
        }
        return result;
    }
    private static String generateQuestion(int num1, int num2, char operation) {
        return num1 + " " + operation + " " + num2;
    }
}
