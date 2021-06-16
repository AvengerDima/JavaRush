package snake;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class Snake extends GameObject {
    private List<GameObject> snakeParts = new ArrayList<>(); //хранение частей змейки в списке
    private static final String HEAD_SIGN = "\uD83D\uDC7D"; //голова змейки (символ UTF-8)
    private static final String BODY_SIGN = "\uD83C\uDE51"; //тело змейки (символ UTF-8)
    public boolean isAlive = true; //змейка по умолчанию жива
    private Direction direction = Direction.LEFT; //движение змейки по умолчанию влево

    //Создаем змейку (из трех сегментов)
    public Snake(int x, int y) {
        super(x, y);
        GameObject snake1 = new GameObject(x, y);
        GameObject snake2 = new GameObject(x + 1, y);
        GameObject snake3 = new GameObject(x + 2, y);
        snakeParts.add(snake1);
        snakeParts.add(snake2);
        snakeParts.add(snake3);
    }

    //Рисуем змейку
    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i == 0) {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, HEAD_SIGN, isAlive ? Color.FIREBRICK : Color.RED, 75);
            } else {
                game.setCellValueEx(snakeParts.get(i).x, snakeParts.get(i).y, Color.NONE, BODY_SIGN, isAlive ? Color.FIREBRICK : Color.RED, 75);
            }
        }
    }

    //Установка направлений
    public void setDirection(Direction direction) {
        if (direction == Direction.LEFT && this.direction == Direction.RIGHT || this.direction == Direction.LEFT && snakeParts.get(0).x == snakeParts.get(1).x) { //при нажатии налево, змейка не сможет двигаться вправо
            return;
        }
        if (direction == Direction.RIGHT && this.direction == Direction.LEFT || this.direction == Direction.RIGHT && snakeParts.get(0).x == snakeParts.get(1).x) { //при нажатии направо, змейка не сможет двигаться влево
            return;
        }
        if (direction == Direction.UP && this.direction == Direction.DOWN || this.direction == Direction.UP && snakeParts.get(0).y == snakeParts.get(1).y) { //при нажатии наверх, змейка не сможет двигаться вниз
            return;
        }
        if (direction == Direction.DOWN && this.direction == Direction.UP || this.direction == Direction.DOWN && snakeParts.get(0).y == snakeParts.get(1).y) { //при нажатии вниз, змейка не сможет двигаться вверх
            return;
        }

        this.direction = direction;
    }

    //Движение змейки и поедание яблока
    public void move(Apple apple) {
        GameObject head = createNewHead();

        if (head.x > SnakeGame.WIDTH - 1 || head.y > SnakeGame.HEIGHT - 1 || head.x < 0 || head.y < 0) { //если змейка выходит за пределы игрового поля, змейка умирает
            isAlive = false;
        } else if (head.x == apple.x && head.y == apple.y){ //если голова змейки совпадает с координатами яблока, тогда
            apple.isAlive = false; //яблоко умирает (съедено)

            if (checkCollision(head)) { //если голова змейки столкнулась со своим телом, змейка умирает
                this.isAlive = false;
                return;
            }
            snakeParts.add(0, head);
        } else {
            if (checkCollision(head)) { //если голова змейки столкнулась со своим телом, змейка умирает
                this.isAlive = false;
                return;
            }
            snakeParts.add(0, head);
            removeTail();
        }
    }

    //Создание новой головы змейки
    public GameObject createNewHead() {
        GameObject newGameObject = new GameObject(0, 0); //координаты головы змейки по умолчанию

        if (direction == Direction.UP) { //если змейка движется вверх, создаем новую голову сверху
            newGameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y - 1);
        } else if (direction == Direction.RIGHT) { //если змейка движется вправо, создаем новую голову справа
            newGameObject = new GameObject(snakeParts.get(0).x + 1, snakeParts.get(0).y);
        } else if (direction == Direction.DOWN) { //если змейка движется вниз, создаем новую голову снизу
            newGameObject = new GameObject(snakeParts.get(0).x, snakeParts.get(0).y + 1);
        } else if (direction == Direction.LEFT) { //если змейка движется влево, создаем новую голову слева
            newGameObject = new GameObject(snakeParts.get(0).x - 1, snakeParts.get(0).y);
        }

        return newGameObject;
    }

    //Удаляем хвост змейки
    public void removeTail() {
        snakeParts.remove(snakeParts.size() - 1);
    }

    //Проверка столкновения со своим телом
    public boolean checkCollision(GameObject gameObject) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (gameObject.x == snakeParts.get(i).x && gameObject.y == snakeParts.get(i).y) {
                return true;
            }
        }

        return false;
    }

    //Хранение текущего размера змейки
    public int getLength() {
        return snakeParts.size();
    }
}
