package Level_6;

/*
Вежливость - это искусственно созданное хорошее настроение
*/

public class lvl_6_task_7 {
    public static void main(String[] args) {
    }

    public static class IntegerHolder {
        private int value;

        public synchronized int get() {
            return value;
        }

        public synchronized void set(int value) {
            this.value = value;
        }
    }
}
