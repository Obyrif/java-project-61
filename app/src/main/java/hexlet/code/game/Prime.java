package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class Prime {
    private static String userName;
    public static void getPrime() {
        Cli.getUserName();

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int count = 0;
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        while (count < 3) {
            int number = random.nextInt(100); // генерируем число
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            boolean isPrimeNumber = true;
            for (int i = 2; i < number; i++) {
                if(number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            String result = isPrimeNumber ? "yes" : "no";
            if(answer.equalsIgnoreCase(result)) {
                System.out.println("Correct!");
            } else {
                System.out.println(answer + " is wrong answer ;(. Correct answer was " + result + ".\n"
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
