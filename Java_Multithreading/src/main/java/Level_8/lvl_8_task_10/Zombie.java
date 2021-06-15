package Level_8.lvl_8_task_10;

import java.util.concurrent.atomic.AtomicInteger;

public class Zombie extends Character {
    private final static AtomicInteger idSequence = new AtomicInteger();
    private final int id = idSequence.incrementAndGet();

    protected int getId() {
        return id;
    }
}
