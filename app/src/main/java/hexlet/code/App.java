package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n0 - Exit");
        if (sc.hasNext()) {
            int player = sc.nextInt();
            System.out.println("Your choice: " + player + "\n");
            if (player == 1) {
                Cli.getUserName();
            } else if (player == 2) {
                Even.getEven();
            } else if (player == 0) {
                sc.close();
            }
        }
    }
}
