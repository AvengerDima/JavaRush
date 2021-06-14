package Level_3;

/*
Напряги извилины!
*/

public class lvl_3_task_10 {
    private final String name;

    lvl_3_task_10(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void sout() {
        new lvl_3_task_10("The Darkside Hacker") {
            void printName() {
                System.out.println(getName());
            }
        }.printName();
    }

    public static void main(String[] args) {
        new lvl_3_task_10("Риша").sout();
    }
}
