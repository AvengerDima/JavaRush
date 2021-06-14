package Level_3.lvl_3_task_4;

/*
Inner 3
*/

import java.util.List;
import java.util.Map;

public class lvl_3_task_4 {
    private List<Task> tasks;
    private List<String> names;

    private DbDataProvider taskDataProvider = new TaskDataProvider();
    private DbDataProvider nameDataProvider = new NameDataProvider();

    public void refresh() {
        Map taskCriteria = MockView.getFakeTaskCriteria();
        taskDataProvider.refreshAllData(taskCriteria);

        Map nameCriteria = MockView.getFakeNameCriteria();
        nameDataProvider.refreshAllData(nameCriteria);
    }

    private interface DbDataProvider<T> {
        void refreshAllData(Map criteria);
    }

    class Task {
    }

    private class TaskDataProvider implements DbDataProvider<Task> {
        @Override
        public void refreshAllData(Map criteria) {
            tasks = MockDB.getFakeTasks(criteria);
        }
    }

    private class NameDataProvider implements DbDataProvider<String> {
        @Override
        public void refreshAllData(Map criteria) {
            names = MockDB.getFakeNames(criteria);
        }
    }

    public static void main(String[] args) {

    }
}
