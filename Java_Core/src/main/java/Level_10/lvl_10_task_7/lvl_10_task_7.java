package Level_10.lvl_10_task_7;

/*
Как сериализовать JavaRush?
*/

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class lvl_10_task_7 {
    public static class JavaRush implements Serializable {
        public List<User> users = new ArrayList<>();
    }

    public static void main(String[] args) {

    }
}
