package Level_8.lvl_8_task_12;

/*
ReentrantReadWriteLock
*/

import java.util.LinkedHashMap;

public class lvl_8_task_12 {
    public static void main(String[] args) {
        ReadWriteMap<Integer, String> linkedSafeMap = new ReadWriteMap<>(new LinkedHashMap<>());
    }
}
