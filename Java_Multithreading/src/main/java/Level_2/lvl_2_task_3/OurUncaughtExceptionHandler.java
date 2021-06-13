package Level_2.lvl_2_task_3;

public class OurUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        final String string = "%s : %s : %s";
        if (lvl_2_task_3.FIRST_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForFirstThread(t, e, string));
        } else if (lvl_2_task_3.SECOND_THREAD_NAME.equals(t.getName())) {
            System.out.println(getFormattedStringForSecondThread(t, e, string));
        } else {
            System.out.println(getFormattedStringForOtherThread(t, e, string));
        }
    }

    protected String getFormattedStringForOtherThread(Thread t, Throwable e, String string) {
        String result = String.format(string, e.getClass().getSimpleName(), e.getCause(), t.getName());
        return result;
    }

    protected String getFormattedStringForSecondThread(Thread t, Throwable e, String string) {
        String result = String.format(string, e.getCause(), e.getClass().getSimpleName(), t.getName());
        return result;
    }

    protected String getFormattedStringForFirstThread(Thread t, Throwable e, String string) {
        String result = String.format(string, t.getName(), e.getClass().getSimpleName(), e.getCause());
        return result;
    }
}
