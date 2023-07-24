package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Calc {
    private static  String userName;
    public static void getCalc() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
        Random rd = new Random();

        System.out.println("What is the result of the expression?");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = rd.nextInt(3);
            int num1 = rd.nextInt(31);
            int num2 = rd.nextInt(31);
            switch (randomNumber) {
                case 0:
                    int sum = num1 + num2;
                    System.out.println("Question: " + num1 + " + " + num2);
                    int answerSum = sc.nextInt();
                    System.out.println("Your answer: " + answerSum);
                    if (sum == answerSum) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerSum + " is wrong answer ;(. Correct answer was " + sum + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                    break;
                case 1:
                    int minus = num1 - num2;
                    System.out.println("Question: " + num1 + " - " + num2);
                    int answerMinus = sc.nextInt();
                    System.out.println("Your answer: " + answerMinus);
                    if (minus == answerMinus) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerMinus + " is wrong answer ;(. Correct answer was " + minus + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                    break;
                case 2:
                    int even = num1 * num2;
                    System.out.println("Question: " + num1 + " * " + num2);
                    int answerEven = sc.nextInt();
                    System.out.println("Your answer: " + answerEven);
                    if (even == answerEven) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerEven + " is wrong answer ;(. Correct answer was " + even + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Error");
            }
            counter++;
        }
        if(counter == 3) {
            System.out.println("Congratulations! " + userName);
        }
    }
}
