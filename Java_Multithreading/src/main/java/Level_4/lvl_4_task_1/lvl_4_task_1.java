package Level_4.lvl_4_task_1;

/*
Создание своего интерфейса-маркера
*/

public class lvl_4_task_1 {
    public static void main(String[] args) throws UnsupportedInterfaceMarkerException {
        SelfInterfaceMarkerImpl obj = new SelfInterfaceMarkerImpl();
        Util.testClass(obj);
    }
}
