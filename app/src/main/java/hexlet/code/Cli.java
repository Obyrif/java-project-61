package hexlet.code;
import java.util.Scanner;

public class Cli {
    private static String userName;
    public static void getUserName() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner sc = new Scanner(System.in);
        userName = sc.nextLine();
        System.out.println("Hello, " + userName + "!");
    }
}
