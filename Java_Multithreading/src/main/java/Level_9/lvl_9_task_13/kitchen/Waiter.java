package Level_9.lvl_9_task_13.kitchen;

import Level_9.lvl_9_task_13.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waiter implements Observer { //Официант
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " was cooked by " + cook);
    }
}
