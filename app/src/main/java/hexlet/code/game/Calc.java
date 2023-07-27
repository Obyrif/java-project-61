package hexlet.code.game;


import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        getCalc();
    }
    public static void getCalc() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        Random rd = new Random();
        System.out.println("What is the result of the expression?");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = rd.nextInt(3);
            int num1 = rd.nextInt(31);
            int num2 = rd.nextInt(31);
            switch (randomNumber) {
                case 0 -> {
                    int sum = num1 + num2;
                    System.out.print("Question: " + num1 + " + " + num2);
                    System.out.print("Your answer: ");
                    int answerSum = sc.nextInt();
                    if (sum == answerSum) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerSum + " is wrong answer ;(. Correct answer was " + sum + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                }
                case 1 -> {
                    int minus = num1 - num2;
                    System.out.println("Question: " + num1 + " - " + num2);
                    System.out.print("Your answer: ");
                    int answerMinus = sc.nextInt();
                    if (minus == answerMinus) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerMinus + " is wrong answer ;(. Correct answer was " + minus + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                }
                case 2 -> {
                    int even = num1 * num2;
                    System.out.println("Question: " + num1 + " * " + num2);
                    System.out.print("Your answer: ");
                    int answerEven = sc.nextInt();
                    if (even == answerEven) {
                        System.out.println("Correct!");
                    } else {
                        System.out.println(answerEven + " is wrong answer ;(. Correct answer was " + even + ".\n"
                                + "Let's try again.");
                        System.exit(0);
                    }
                }
                default -> System.out.println("Error");
            }
            counter++;
        }
        if (counter == 3) {
            System.out.println("Congratulations! " + userName);
        }
    }
}
