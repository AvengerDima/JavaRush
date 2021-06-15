package Level_8;

/*
Осваиваем switch
*/

public class lvl_8_task_1 {
    public static enum E1 {A, B, C, Y}

    public static enum E2 {D, E, F}

    public static enum E3 {D, E, F}

    public static void main(String[] args) {
        lvl_8_task_1.switchTest(E1.C);
        lvl_8_task_1.switchTest(E3.D);
        lvl_8_task_1.switchTest(E2.D);
        /* output
        it's E1.C
        undefined
        it's E2.D
         */
    }

    public static void switchTest(Enum obj) {
        //add your code here
        String className = obj.getClass().getSimpleName();
        switch (className) {
            case "E1":
            case "E2":
                System.out.println("it's " + className + "." + obj.name());
                break;
            default:
                System.out.println("undefined");
                break;
        }
    }
}
