package Level_4;

/*
Так-с... сопоставим
*/

import java.io.Serializable;
import java.rmi.Remote;
import java.util.ArrayDeque;
import java.util.EventListener;

public class lvl_4_task_3 {
    public static class A implements Serializable {
    }

    public static class B implements Remote {
    }

    public static class C extends ArrayDeque {
        public C clone() {
            return (C) super.clone();
        }
    }

    public static class D implements EventListener {
    }

    public static void main(String[] args) {

    }
}
