package Level_5.lvl_5_task_4;

public class LoggingStateThread extends Thread {
    private Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        State currentState = thread.getState();
        System.out.println(currentState);

        State newState;
        do {
            if ((newState = thread.getState()) != currentState) {
                currentState = newState;
                System.out.println(newState);
            }
        } while (!currentState.equals(State.TERMINATED));
    }
}
