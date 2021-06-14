package Level_5;

/*
Первый закон Финэйгла: если эксперимент удался, что-то здесь не так...
*/

public class lvl_5_task_14 {
    public static class YieldRunnable implements Runnable {
        private int index;

        public YieldRunnable(int index) {
            this.index = index;
        }

        public void run() {
            System.out.println("begin-" + index);
            Thread.yield();
            System.out.println("end-" + index);
        }
    }

    public static void main(String[] args) {
    }
}
