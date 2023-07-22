package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void getEven() {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc1 = new Scanner(System.in);
        String userName = sc1.nextLine();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100) + 1;
            System.out.println("Question: " + number);
            String answer = sc.nextLine();
            System.out.println("Your answer: " + answer);
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";
            if (answer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct, " + userName + "!");
            } else {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + userName);
            }
        }
    }
}
