package Level_3.lvl_3_task_13;

/**
 * Класс для космического корабля
 */
public class SpaceShip extends BaseObject {
    //картинка корабля для отрисовки
    private static int[][] matrix = {
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0},
            {1, 0, 1, 0, 1},
            {1, 1, 1, 1, 1},
    };

    //вектор движения (-1 влево,+1 вправо)
    private double dx = 0;

    public SpaceShip(double x, double y) {
        super(x, y, 3);
    }

    /**
     * Устанавливаем вектор движения влево
     */
    public void moveLeft() {
        dx = -1;
    }

    /**
     * Устанавливаем вектор движения вправо
     */
    public void moveRight() {
        dx = 1;
    }

    /**
     * Метод рисует свой объект на "канвасе".
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.drawMatrix(x - radius + 1, y - radius + 1, matrix, 'M');
    }

    /**
     * Двигаем себя на один ход.
     * Проверяем столкновение с границами.
     */
    @Override
    public void move() {
        x = x + dx;

        checkBorders(radius, lvl_3_task_13.game.getWidth() - radius + 1, 1, lvl_3_task_13.game.getHeight() + 1);
    }

    /**
     * Стреляем.
     * Создаем две ракеты: слева и справа от корабля.
     */
    public void fire() {
        lvl_3_task_13.game.getRockets().add(new Rocket(x - 2, y));
        lvl_3_task_13.game.getRockets().add(new Rocket(x + 2, y));
    }
}
