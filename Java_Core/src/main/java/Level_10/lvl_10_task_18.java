package Level_10;

/*
Найти ошибки
*/

import java.io.*;

public class lvl_10_task_18 implements Serializable {
    public static class A {

        protected String nameA = "A";

        public A(String nameA) {
            this.nameA += nameA;
        }

        public A() {

        }
    }

    public class B extends A implements Serializable {
        private String nameB;

        public B(String nameA, String nameB) {
            super(nameA);
            this.nameA += nameA;
            this.nameB = nameB;
        }

        private void writeObject(ObjectOutputStream out) throws Exception {
            out.defaultWriteObject();
            out.writeObject(nameA);
        }

        private void readObject(ObjectInputStream in) throws Exception {
            in.defaultReadObject();
            nameA = (String) in.readObject();
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(arrayOutputStream);

        lvl_10_task_18 solution = new lvl_10_task_18();
        B b = solution.new B("B2", "C33");
        System.out.println("nameA: " + b.nameA + ", nameB: " + b.nameB);

        oos.writeObject(b);

        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(arrayOutputStream.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(arrayInputStream);

        B b1 = (B) ois.readObject();
        System.out.println("nameA: " + b1.nameA + ", nameB: " + b1.nameB);
    }
}
