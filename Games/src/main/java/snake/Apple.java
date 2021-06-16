package snake;


import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class Apple extends GameObject {
    private static final String APPLE_SIGN = "\uD83C\uDF4E"; //Яблоко (символ UTF-8)
    public boolean isAlive = true; //Яблоко по умолчанию живое

    public Apple(int x, int y) {
        super(x, y);
    }

    //Рисуем яблоко
    public void draw(Game game) {
        game.setCellValueEx(x, y, Color.NONE, APPLE_SIGN, Color.GREEN, 75);
    }
}
