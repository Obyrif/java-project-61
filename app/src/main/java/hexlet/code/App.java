package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    private static final int ONE = 1;
    private static final int TWO = 2;
    private static final int THREE = 3;
    private static final int FOUR = 4;
    private static final int FIVE = 5;
    private static final int SIX = 6;
    private static final int NULL = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        int player = sc.nextInt();
        System.out.println();
        if (player == ONE) {
            Cli.getUserName();
        } else if (player == TWO) {
            Even.getEven();
        } else if (player == THREE) {
            Calc.getCalc();
        } else if (player == FOUR) {
            GCD.getGCD();
        } else if (player == FIVE) {
            Progression.getProgression();
        } else if (player == SIX) {
            Prime.getPrime();
        } else if (player == NULL) {
            sc.close();
        }
    }
}
