package racer.road;

import com.javarush.engine.cell.Game;
import racer.PlayerCar;
import racer.RacerGame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoadManager {
    public static final int LEFT_BORDER = RacerGame.ROADSIDE_WIDTH;
    public static final int RIGHT_BORDER = RacerGame.WIDTH - LEFT_BORDER;
    private static final int FIRST_LANE_POSITION = 16;
    private static final int FOURTH_LANE_POSITION = 44;
    private List<RoadObject> items = new ArrayList<>();
    private static final int PLAYER_CAR_DISTANCE = 12;
    private int passedCarsCount = 0;

    private RoadObject createRoadObject(RoadObjectType type, int x, int y) {
        if (type == RoadObjectType.THORN) {
            return new Thorn(x, y);
        } else if (type == RoadObjectType.DRUNK_CAR) {
            return new MovingCar(x, y);
        } else {
            return new Car(type, x, y);
        }
    }

    private void addRoadObject(RoadObjectType type, Game game) {
        int x = game.getRandomNumber(FIRST_LANE_POSITION, FOURTH_LANE_POSITION);
        int y = -1 * RoadObject.getHeight(type);
        RoadObject roadObject = createRoadObject(type, x, y);

        if (createRoadObject(type, x, y) != null && isRoadSpaceFree(roadObject)) {
            items.add(roadObject);
            items.add(roadObject);
        }
    }

    public void draw(Game game) {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).draw(game);
        }
    }
    public void move(int boost) {
        for (int i = 0; i < items.size(); i++) {
            this.items.get(i).move(boost + this.items.get(i).speed, items);
        }
        deletePassedItems();
    }

    private boolean isThornExists() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).type == RoadObjectType.THORN) {
                return true;
            }
        }
        return false;
    }

    private void generateThorn(Game game) {
        int rNThorn = game.getRandomNumber(100);

        if (rNThorn < 10 && isThornExists() == false) {
            addRoadObject(RoadObjectType.THORN, game);
        }
    }

    private boolean isMovingCarExists() {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).type == RoadObjectType.DRUNK_CAR) {
                return true;
            }
        }
        return false;
    }

    private void generateMovingCar(Game game) {
        int rNMovingCar = game.getRandomNumber(100);

        if (rNMovingCar < 10 && isMovingCarExists() == false) {
            addRoadObject(RoadObjectType.DRUNK_CAR, game);
        }
    }

    public void generateNewRoadObjects(Game game) {
        generateThorn(game);
        generateRegularCar(game);
        generateMovingCar(game);
    }

    private void deletePassedItems() {
        Iterator iterator = items.iterator();

        while (iterator.hasNext()) {
            RoadObject item = (RoadObject)iterator.next();
            if (item.y >= RacerGame.HEIGHT) {
                if (!item.type.equals(RoadObjectType.THORN)) {
                    passedCarsCount++;
                }
                iterator.remove();
            }
        }
    }

    public boolean checkCrush(PlayerCar playerCar) {
        boolean crush = false;

        for (int i = 0; i < items.size(); i++) {
            crush = this.items.get(i).isCollision(playerCar);
            if (crush) {
                return true;
            }
        }
        return false;
    }

    private void generateRegularCar(Game game) {
        int rNCar = game.getRandomNumber(100);
        int carTypeNumber = game.getRandomNumber(4);

        if (rNCar < 30) {
            addRoadObject(RoadObjectType.values()[carTypeNumber], game);
        }
    }

    private boolean isRoadSpaceFree(RoadObject object) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).isCollisionWithDistance(object, PLAYER_CAR_DISTANCE)) {
                return false;
            }
        }
        return true;
    }

    public int getPassedCarsCount() {
        return passedCarsCount;
    }
}
