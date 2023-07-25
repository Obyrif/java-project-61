package hexlet.code.game;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    private static String userName;
    public static void getGCD() {
        Cli.getUserName();

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        int counter = 0;
        while (counter < 3) {
            int randomNumber = rd.nextInt(2);
            int num1 = rd.nextInt(101);
            int num2 = rd.nextInt(101);
            switch (randomNumber) {
                case 0:
                    System.out.println("Question: " + num1 + " " + num2);
                    int answer = sc.nextInt();
                    int gcd = calculateGCD(num1, num2);
                    System.out.println("Your answer: " + answer);
                    if (answer == gcd) {
                        System.out.println("Correct!");
                        counter++;
                    } else {
                        System.out.println(answer + " is wrong answer ;(. Correct answer was '25'.\n"
                               + "Let's try again, " + userName);
                        return;
                    }
                    break;
                default:
                    System.out.println("Error");

            }
        }
        if(counter == 3) {
            System.out.println("Congratulations, " + userName);
        }
    }

    public static int calculateGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
