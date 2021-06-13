package Level_2;

/*
МНЕ нравится курс JavaRush
*/

public class lvl_2_task_5 {
    public static void main(String[] args) {
        System.out.println(String.format(getFormattedString(), "JavaRush", "курс", "мне", "нравится"));
        //должен быть вывод
        //"МНЕ нравится курс JavaRush"
    }

    public static String getFormattedString() {
        return "%3$S %4$s %2$s %s";
    }
}
