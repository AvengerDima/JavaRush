package Level_3.lvl_3_task_4;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MockDB {
    private static final List<lvl_3_task_4.Task> FAKE_TASKS = new ArrayList<>();
    private static final List<String> FAKE_NAMES = new ArrayList<>();

    public static List<lvl_3_task_4.Task> getFakeTasks(Map criteria) {
        return MockView.getFakeTaskCriteria().equals(criteria) ? FAKE_TASKS : null;
    }

    public static List<String> getFakeNames(Map criteria) {
        return MockView.getFakeNameCriteria().equals(criteria) ? FAKE_NAMES : null;
    }
}
