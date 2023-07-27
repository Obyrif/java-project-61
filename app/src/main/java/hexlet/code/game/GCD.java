package hexlet.code.game;


import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void getGCD() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        Random rd = new Random();
        System.out.println("Find the greatest common divisor of given numbers.");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = rd.nextInt(2);
            int num1 = rd.nextInt(101);
            int num2 = rd.nextInt(101);
            if (randomNumber == 0) {
                System.out.println("Question: " + num1 + " " + num2);
                int gcd = calcGCD(num1, num2);
                System.out.print("Your answer: ");
                int answer = sc.nextInt();
                if (answer == gcd) {
                    System.out.println("Correct!");
                    counter++;
                } else {
                    System.out.println(answer + " is wrong answer ;(. Correct answer was " + calcGCD(num1, num2) + ".\n"
                            + "Let's try again, " + userName);
                    System.exit(0);
                }
            }
        }
        if (counter == 3) {
            System.out.println("Congratulations, " + userName);
        }
    }

    public static int calcGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
