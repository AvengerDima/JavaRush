package racer;

import racer.road.RoadManager;
import racer.road.ShapeMatrix;

public class PlayerCar extends GameObject {
    private static int playerCarHeight = ShapeMatrix.PLAYER.length;
    public int speed = 1;
    private Direction direction;

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public void move() {
        if (direction == Direction.LEFT) {
            x--;
        }
        if (direction == Direction.RIGHT) {
            x++;
        }
        if (x < RoadManager.LEFT_BORDER) {
            x = RoadManager.LEFT_BORDER;
        }
        if (x > RoadManager.RIGHT_BORDER - width) {
            x = RoadManager.RIGHT_BORDER - width;
        }
    }

    public PlayerCar() {
        super(RacerGame.WIDTH / 2 + 2, RacerGame.HEIGHT - playerCarHeight - 1, ShapeMatrix.PLAYER);
    }

    public void stop() {
        matrix = ShapeMatrix.PLAYER_DEAD;
    }
}
