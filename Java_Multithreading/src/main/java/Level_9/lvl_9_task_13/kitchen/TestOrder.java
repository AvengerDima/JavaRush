package Level_9.lvl_9_task_13.kitchen;

import Level_9.lvl_9_task_13.Tablet;

import java.io.IOException;
import java.util.ArrayList;

public class TestOrder extends Order {
    public TestOrder(Tablet tablet) throws IOException {
        super(tablet);
    }

    @Override
    protected void initDishes() throws IOException {
        dishes = new ArrayList<>();
        for (Dish dish : Dish.values()) {
            if ((int) (Math.random() * 2) == 1) {
                dishes.add(dish);
            }
        }
    }
}
