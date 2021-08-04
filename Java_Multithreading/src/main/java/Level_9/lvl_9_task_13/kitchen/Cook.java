package Level_9.lvl_9_task_13.kitchen;

import Level_9.lvl_9_task_13.ConsoleHelper;
import Level_9.lvl_9_task_13.statistic.StatisticManager;
import Level_9.lvl_9_task_13.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Runnable { //Повар
    private final String name;
    private boolean busy;
    private LinkedBlockingQueue queue = new LinkedBlockingQueue<>();

    public Cook(String name) {
        this.name = name;
    }

    public boolean isBusy() {
        return busy;
    }

    @Override
    public String toString() {
        return name;
    }

    public void startCookingOrder(Order order) throws InterruptedException {
        busy = true;
        ConsoleHelper.writeMessage("Start cooking - " + order + ", cooking time " + order.getTotalCookingTime() + "min");

        StatisticManager.getInstance().register(new CookedOrderEventDataRow(order.toString(), this.name,
                order.getTotalCookingTime() * 60, order.getDishes()));
        try {
            Thread.sleep(order.getTotalCookingTime() * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        setChanged();
        notifyObservers(order);
        busy = false;
    }

    @Override
    public void run() {

        while (!Thread.currentThread().isInterrupted()) {
            try {
                while (!queue.isEmpty()) {
                    if (!this.isBusy()) {
                        Order order = (Order) queue.poll();
                        if (order != null)
                            this.startCookingOrder(order);
                    }
                }

                Thread.sleep(10);
            }
            catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void setQueue(LinkedBlockingQueue<Order> orderQueue) {
        this.queue = orderQueue;
    }
}
