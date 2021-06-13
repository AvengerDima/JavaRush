package Level_10;

/*
Как сериализовать static?
*/

import java.io.Serializable;

public class lvl_10_task_9 {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
