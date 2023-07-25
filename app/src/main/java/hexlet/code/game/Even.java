package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Even {
    private static String userName;
    public static void getEven() {
        Cli.getUserName();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n"
                       + "Let's try again, " + userName);
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
