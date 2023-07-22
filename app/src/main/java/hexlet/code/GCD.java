package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        getGCD();
    }

    public static void getGCD() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
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
                        System.out.println(answer + "is wrong answer ;(. Correct answer was '25'.\n"
                               + "Let's try again, " + userName);
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Error");

            }
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
