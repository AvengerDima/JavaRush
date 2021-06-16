package snake;


import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

public class SnakeGame extends Game {
    public static final int WIDTH = 30; //ширина (x) поля
    public static final int HEIGHT = 30; //высота (y) поля
    private Snake snake; //змейка
    private int turnDelay; //задержка при повороте
    private Apple apple; //яблоко
    private boolean isGameStopped; //остановка игры
    private static final int GOAL = 28;
    private int score; //количество очков на старте игры по умолчанию 0
    public boolean mainScreen = true;

    //Инициализация игры
    @Override
    public void initialize() {
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT); //устанавливаем размер игрового поля
        mainMenu(); //запускаем главную страницу
    }

    //Рисуем объекты (В игре)
    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.DARKSEAGREEN, ""); //устанавливаем цвет для координат x,y
            }
        }

        snake.draw(this); //рисуем змейку
        apple.draw(this); //рисуем яблоко
    }

    //Рисуем главную страницу игры
    private void drawMainMenu() {
        //Заполняем фон цветом
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellValueEx(x, y, Color.DARKCYAN, ""); //устанавливаем цвет для координат x,y
            }
        }

        //Фон логотипа игры
        for (int x = 2; x < 28; x++) {
            for (int y = 1; y < 15; y++) {
                setCellColor(x, y, Color.GREY);
            }
        }

        //Тень фона
        for (int x = 28; x < 29; x++) {
            for (int y = 2; y < 16; y++) {
                setCellColor(x, y, Color.BLACK);
            }
            for (int i = 3; i < 29; i++) {
                for (int y = 15; y < 16; y++) {
                    setCellColor(i, y, Color.BLACK);
                }
            }
        }

        //Рисуем букву S
        for (int x = 4; x < 7; x++) {
            for (int y = 3; y < 5; y++) {
                setCellColor(x, y, Color.BLUE);
            }
            for (int i = 4; i < 7; i++) {
                for (int y = 7; y < 9; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
            for (int j = 4; j < 7; j++) {
                for (int y = 11; y < 13; y++) {
                    setCellColor(j, y, Color.BLUE);
                }
            }
        }
        setCellColor(4, 5, Color.BLUE);
        setCellColor(4, 6, Color.BLUE);
        setCellColor(6, 9, Color.BLUE);
        setCellColor(6, 10, Color.BLUE);

        //Рисуем букву N
        for (int x = 8; x < 9; x++) {
            for (int y = 3; y < 13; y++) {
                setCellColor(x, y, Color.BLUE);
            }
            for (int i = 11; i < 12; i++) {
                for (int y = 3; y < 13; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
        }
        setCellColor(9, 5, Color.BLUE);
        setCellColor(9, 6, Color.BLUE);
        setCellColor(10, 7, Color.BLUE);
        setCellColor(10, 8, Color.BLUE);

        //Рисуем букву A
        for (int x = 13; x < 14; x++) {
            for (int y = 3; y < 13; y++) {
                setCellColor(x, y, Color.BLUE);
            }
            for (int i = 16; i < 17; i++) {
                for (int y = 3; y < 13; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
            for (int i = 14; i < 16; i++) {
                for (int y = 3; y < 5; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
            for (int i = 14; i < 16; i++) {
                for (int y = 7; y < 9; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
        }

        //Рисуем букву K
        for (int x = 18; x < 19; x++) {
            for (int y = 3; y < 13; y++) {
                setCellColor(x, y, Color.BLUE);
            }
        }
        setCellColor(19, 7, Color.BLUE);
        setCellColor(19, 8, Color.BLUE);
        setCellColor(20, 5, Color.BLUE);
        setCellColor(20, 6, Color.BLUE);
        setCellColor(20, 9, Color.BLUE);
        setCellColor(20, 10, Color.BLUE);
        setCellColor(21, 3, Color.BLUE);
        setCellColor(21, 4, Color.BLUE);
        setCellColor(21, 11, Color.BLUE);
        setCellColor(21, 12, Color.BLUE);

        //Рисуем букву E
        for (int x = 23; x < 26; x++) {
            for (int y = 3; y < 5; y++) {
                setCellColor(x, y, Color.BLUE);
            }
            for (int i = 23; i < 26; i++) {
                for (int y = 7; y < 9; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
            for (int i = 23; i < 26; i++) {
                for (int y = 11; y < 13; y++) {
                    setCellColor(i, y, Color.BLUE);
                }
            }
        }
        setCellColor(23, 5, Color.BLUE);
        setCellColor(23, 6, Color.BLUE);
        setCellColor(23, 9, Color.BLUE);
        setCellColor(23, 10, Color.BLUE);

        //Символ змейки
        setCellValueEx(25, 2, Color.NONE, "\uD83D\uDC0D", Color.YELLOW, 75);

        //Версия игры
        setCellValueEx(26, 29, Color.NONE, "V", Color.YELLOW, 75);
        setCellValueEx(27, 29, Color.NONE, "1.1", Color.YELLOW, 75);

        //Рисуем Play
        for (int x = 13; x < 14; x++) {
            for (int y = 20; y < 27; y++) {
                setCellColor(x, y, Color.AQUAMARINE);
            }
            for (int i = 14; i < 15; i++) {
                for (int y = 21; y < 26; y++) {
                    setCellColor(i, y, Color.AQUAMARINE);
                }
            }
            for (int i = 15; i < 16; i++) {
                for (int y = 22; y < 25; y++) {
                    setCellColor(i, y, Color.AQUAMARINE);
                }
            }
            for (int i = 16; i < 17; i++) {
                for (int y = 23; y < 24; y++) {
                    setCellColor(i, y, Color.AQUAMARINE);
                }
            }
        }

        //Тень play
        for (int x = 16; x < 17; x++) {
            for (int y = 24; y < 25; y++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
        for (int x = 15; x < 16; x++) {
            for (int y = 25; y < 26; y++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
        for (int x = 14; x < 15; x++) {
            for (int y = 26; y < 27; y++) {
                setCellColor(x, y, Color.BLACK);
            }
        }
    }

    private void mainMenu() {
        isGameStopped = true;
        drawMainMenu();
    }

    //Создаем игру
    private void createGame() {
        snake = new Snake(WIDTH / 2, HEIGHT / 2); //создаем змейку в центре игрового поля
        createNewApple(); //создаем яблоко
        isGameStopped = false;
        drawScene();
        turnDelay = 300;
        setTurnTimer(turnDelay);
        score = 0;
        setScore(score);
    }

    //Запуск таймера игры
    @Override
    public void onTurn(int step) {
        snake.move(apple);

        if (apple.isAlive == false) { //если яблоко неживое (съедено), тогда создаем новое
            createNewApple();
            score = score + 5;
            setScore(score);
            turnDelay = turnDelay - 10;
            setTurnTimer(turnDelay);
        }
        if (snake.isAlive == false) { //если змейка мертва, игра окончена поражением
            gameOver();
        }
        if (snake.getLength() > GOAL) { //если сегментов змейки больше, чем нужно, тогда игра окончена победой
            win();
        }

        drawScene();
    }

    //Считывание с клавиатуры
    @Override
    public void onKeyPress(Key key) {
        if (key == Key.LEFT) { //при нажатии влево, змейка будет двигаться влево
            snake.setDirection(Direction.LEFT);
        }
        if (key == Key.RIGHT) { //при нажатии вправо, змейка будет двигаться вправо
            snake.setDirection(Direction.RIGHT);
        }
        if (key == Key.UP) { //при нажатии вверх, змейка будет двигаться вверх
            snake.setDirection(Direction.UP);
        }
        if (key == Key.DOWN) { //при нажатии влево, змейка будет двигаться влево
            snake.setDirection(Direction.DOWN);
        }
        if (key == Key.SPACE && isGameStopped == true) { //при нажатии пробела, реализуется рестарт игры
            createGame();
        }
        if (key == Key.SPACE && mainScreen == true) {
            createGame();
            mainScreen = false;
        }
    }

    //Считывание с мышки
    @Override
    public void onMouseLeftClick(int x, int y) {
        if (x == 13 && y == 20 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 21 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 22 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 23 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 24 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 25 && isGameStopped == true) {
            createGame();
        } else if (x == 13 && y == 26 && isGameStopped == true) {
            createGame();
        } else if (x == 14 && y == 21 && isGameStopped == true) {
            createGame();
        } else if (x == 14 && y == 22 && isGameStopped == true) {
            createGame();
        } else if (x == 14 && y == 23 && isGameStopped == true) {
            createGame();
        } else if (x == 14 && y == 24 && isGameStopped == true) {
            createGame();
        } else if (x == 14 && y == 25 && isGameStopped == true) {
            createGame();
        } else if (x == 15 && y == 22 && isGameStopped == true) {
            createGame();
        } else if (x == 15 && y == 23 && isGameStopped == true) {
            createGame();
        } else if (x == 15 && y == 24 && isGameStopped == true) {
            createGame();
        } else if (x == 16 && y == 23 && isGameStopped == true) {
            createGame();
        }
    }

    //Создание яблок
    private void createNewApple() {
        do {
            apple = new Apple(getRandomNumber(WIDTH), getRandomNumber(HEIGHT));
        } while (snake.checkCollision(apple)); //не даем яблоке создаться в теле змейки
    }

    //Поражение
    private void gameOver() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.GREY, "GAME OVER\n" + "\n   Score: " + score, Color.SALMON, 75);
    }

    //Победа
    private void win() {
        stopTurnTimer();
        isGameStopped = true;
        showMessageDialog(Color.GREY, "YOU WIN\n" + "\nScore: " + score, Color.SPRINGGREEN, 75);
    }
}