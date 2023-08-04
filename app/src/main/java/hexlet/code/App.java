package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet\n2 - Even\n3 - Calc\n4 - GCD\n5 - Progression\n6 - Prime\n0 - Exit");
        System.out.print("Your choice: ");
        String player = sc.nextLine();
        System.out.println();
        switch (player) {
            case "1":
                Cli.getUserName();
                break;
            case "2":
                Even.getEven();
                break;
            case "3":
                Calc.getCalc();
                break;
            case "4":
                GCD.getGCD();
                break;
            case "5":
                Progression.getProgression();
                break;
            case "6":
                Prime.getPrime();
                break;
            default:
                sc.close();
                break;
        }
    }
}
