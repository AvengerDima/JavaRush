package Level_7.lvl_7_task_12.command;

import Level_7.lvl_7_task_12.ConsoleHelper;

public class ExitCommand implements Command {
    @Override
    public void execute() throws Exception {
        ConsoleHelper.writeMessage("До встречи!");
    }
}
