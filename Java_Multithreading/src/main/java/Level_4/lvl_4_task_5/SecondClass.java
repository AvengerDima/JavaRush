package Level_4.lvl_4_task_5;

public class SecondClass implements Action { //second implementation
    public static String SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM = "\nSpecific action for anonymous SecondClass, param = ";

    private static String SECOND_CLASS_METHOD_STRING = "class SecondClass, method someAction";

    public SecondClass() {
        lvl_4_task_5.countActionObjects++;
    }

    protected StringBuilder sb = new StringBuilder(SECOND_CLASS_METHOD_STRING);

    public void someAction() {
        System.out.println(sb.toString());
    }
}
