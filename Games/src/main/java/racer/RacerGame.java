package racer;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;
import racer.road.RoadManager;

public class RacerGame extends Game {
    public static final int WIDTH = 64; //Ширина (x) поля
    public static final int HEIGHT = 64; //Высота (y) поля
    public static final int CENTER_X = WIDTH / 2; //Разделительная полоса
    public static final int ROADSIDE_WIDTH = 14; //Обочина
    private RoadMarking roadMarking;
    private PlayerCar player;
    private RoadManager roadManager;
    private boolean isGameStopped;
    private FinishLine finishLine;
    private static final int RACE_GOAL_CARS_COUNT = 40;
    private ProgressBar progressBar;
    private int score;

    //Инициализация игры
    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT); //устанавливаем размер игрового поля
        showGrid(false);
        createGame(); //запускаем игру
    }

    //Создаем новую игру
    private void createGame() {
        roadMarking = new RoadMarking();
        player = new PlayerCar();
        roadManager = new RoadManager();
        finishLine = new FinishLine();
        progressBar = new ProgressBar(RACE_GOAL_CARS_COUNT);
        drawScene();
        setTurnTimer(40);
        isGameStopped = false;
        score = 3500;
    }

    //Рисуем игровые объекты
    private void drawScene() {
        drawField();
        finishLine.draw(this);
        roadManager.draw(this);
        roadMarking.draw(this);
        player.draw(this);
        progressBar.draw(this);
    }

    //Рисуем фон игрового поля
    private void drawField() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (x == CENTER_X) { //Разделительная полоса
                    setCellColor(CENTER_X, y, Color.WHITE);
                } else if (x >= ROADSIDE_WIDTH && x < (WIDTH - ROADSIDE_WIDTH)) { //Дорога
                    setCellColor(x, y, Color.DIMGRAY);
                } else { //Обочина
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x < WIDTH && x >= 0 && y < HEIGHT && y >= 0) {
            super.setCellColor(x, y, color);
        } else {

        }
    }

    //Перемещение игровых объектов
    private void moveAll() {
        roadMarking.move(player.speed);
        player.move();
        roadManager.move(player.speed);
        finishLine.move(player.speed);
        progressBar.move(roadManager.getPassedCarsCount());
    }

    @Override
    public void onTurn(int step) {
        if (roadManager.getPassedCarsCount() >= RACE_GOAL_CARS_COUNT) {
            finishLine.show();
        }
        if (roadManager.checkCrush(player)) {
            gameOver();
        } else if (finishLine.isCrossed(player) == true) {
            win();
        } else {
            roadManager.generateNewRoadObjects(this);
            moveAll();
        }
        score -= 5;
        setScore(score);
        drawScene();
    }

    @Override
    public void onKeyPress(Key key) {
        if (key == Key.RIGHT) { //при нажатии кнопки влево, игрок будет двигаться влево
            player.setDirection(Direction.RIGHT);
        }
        if (key == Key.LEFT) { //при нажатии кнопки вправо, игрок будет двигаться вправо
            player.setDirection(Direction.LEFT);
        }
        if (key == Key.SPACE && isGameStopped == true) { //при нажатии пробела, реализуется рестарт игры
            createGame();
        }
        if (key == Key.UP) {
            player.speed = 2;
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        switch (key){
            case RIGHT:
                if (player.getDirection().equals(Direction.RIGHT)) player.setDirection(Direction.NONE);
                break;
            case LEFT:
                if (player.getDirection().equals(Direction.LEFT)) player.setDirection(Direction.NONE);
                break;
            case UP:
                player.speed = 1;
        }
    }

    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.GREY, "GAME OVER", Color.SALMON, 75);
        player.stop();
    }

    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.GREY, "WIN", Color.SPRINGGREEN, 75);
    }
}
