package Level_4.lvl_4_task_11;

/*
Вспомним наследование
*/

public class lvl_4_task_11 {
    private class A extends C {
        protected String value = "A";

        public A() {
            System.out.print(value);
        }
    }

    private A a = new A() {
        { //у анонимных классов нет своих конструкторов, но что-то можно сделать в блоке инициализации класса
            value = "Y";
            if (super.getClass().getName().contains(".Solution$")) {
                System.out.print(value);
            }
        }
    };

    public lvl_4_task_11() {
        System.out.print("S");
    }

    public static void main(String[] args) {
        new lvl_4_task_11();
    }
}
