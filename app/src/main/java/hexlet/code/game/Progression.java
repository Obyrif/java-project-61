package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Progression {
    private static String userName;
    public static void getProgression() {
        Cli.getUserName();

        Random random = new Random();

        int minLength = 5;
        int maxLength = 10;
        int progressionLength = random.nextInt(maxLength - minLength + 1) + minLength;
        int index = random.nextInt(progressionLength);
        int count = 0;

        System.out.println("What number is missing in the progression?");
        Scanner sc = new Scanner(System.in);
        while (count < 3) {
            System.out.print("Question: ");
            int firstNumber = random.nextInt(100);
            int difference = random.nextInt(10) + 1;

            for (int i = 0; i < progressionLength; i++) {
                if (i == index) {
                    System.out.print(".. ");
                } else {
                    System.out.print(firstNumber + " ");
                }
                firstNumber += difference;
            }
            System.out.println();

            System.out.print("Your answer: ");
            int answer = sc.nextInt();
            int hiddenNumber = firstNumber + index * difference;
            if (answer == hiddenNumber) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + "is wrong answer ;(. Correct answer was " + hiddenNumber + ".\n"
                        + "Let's try again, " + userName);
                return;
            }
            count++;
        }
        if(count == 3) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }
}
