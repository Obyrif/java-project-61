package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int ROUNDS = 3;
    public static final int QUESTION = 0;
    public static final int ANSWER = 1;

    public static void engine(String des, String[][] element) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");

        System.out.println(des);

        for (var i: element) {
            System.out.println("Question: " + i[QUESTION]);
            System.out.print("Your choice: ");
            String user = sc.nextLine();

            if (user.equalsIgnoreCase(i[ANSWER])) {
                System.out.println("Correct!");
            } else {
                System.out.println(user + " is wrong answer ;(. Correct answer was " + i[ANSWER] + ".\n"
                        + "Let's try again, " + userName + "!");
                sc.close();
                return;
            }
        }
        System.out.println("Congratulations, " + userName + "!");
        sc.close();
    }
}
