package Level_3;

/*
Как выбрать нужное?
*/

public class lvl_3_task_7 {
    public static final String TEST = "test";

    public static class TEST {
        @Override
        public String toString() {
            return "test class";
        }
    }

    static Object obj;

    public static void main(String[] args) {
        obj = new TEST();
        System.out.println(obj);
    }
}
