package Level_6;

/*
Весь мир играет комедию
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class lvl_6_task_12 {
    private Lock lock = new ReentrantLock();

    public void someMethod() {
        // Implement the logic here. Use the lock field
        if (lock.tryLock()) {
            try {
                actionIfLockIsFree();
            } finally {
                lock.unlock();
            }
        } else {
            actionIfLockIsBusy();
        }

    }

    public void actionIfLockIsFree() {
    }

    public void actionIfLockIsBusy() {
    }
}
