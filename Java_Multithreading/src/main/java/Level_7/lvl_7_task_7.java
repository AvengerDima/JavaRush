package Level_7;

/*
Определяем порядок захвата монитора
*/

public class lvl_7_task_7 {
    private static volatile boolean flag = false;
    private static volatile boolean isInnerThreadBlocked = false;

    public void someMethodWithSynchronizedBlocks(Object obj1, Object obj2) {
        synchronized (obj1) {
            synchronized (obj2) {
                System.out.println(obj1 + " " + obj2);
            }
        }
    }

    public static boolean isLockOrderNormal(final lvl_7_task_7 solution, final Object o1, final Object o2) throws Exception {
        //do something here
        synchronized (o1) {
            Thread outerThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread innerThread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            solution.someMethodWithSynchronizedBlocks(o1, o2);
                        }
                    });
                    innerThread.start();

                    while (innerThread.getState() != Thread.State.BLOCKED);
                    isInnerThreadBlocked = true;
                    synchronized (o2) {
                        flag = true;
                    }
                }
            });
            outerThread.setDaemon(true);
            outerThread.start();

            while (!isInnerThreadBlocked) {
                Thread.sleep(1);
            }
            while (outerThread.getState() != Thread.State.BLOCKED && outerThread.isAlive()) {
                Thread.sleep(1);
            }
        }
        return flag;
    }

    public static void main(String[] args) throws Exception {
        final lvl_7_task_7 solution = new lvl_7_task_7();
        final Object o1 = new Object();
        final Object o2 = new Object();

        System.out.println(isLockOrderNormal(solution, o1, o2));
    }
}
