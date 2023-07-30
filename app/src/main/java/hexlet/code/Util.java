package hexlet.code;

import static hexlet.code.game.Calc.OPERATION;

public class Util {
    public static int random() {
        return (int) Math.floor(Math.random() * OPERATION.length);
    }
}
