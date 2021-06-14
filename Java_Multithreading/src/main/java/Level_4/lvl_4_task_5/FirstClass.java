package Level_4.lvl_4_task_5;

public abstract class FirstClass implements Action { //first implementation

    protected FirstClass() {
        lvl_4_task_5.countActionObjects++;
    }

    public void someAction() {
        System.out.println("class FirstClass, method someAction");
    }

    public abstract Action getDependantAction();
}
