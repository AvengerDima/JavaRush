package Level_6;

/*
Был бы ум - будет и успех
*/

import java.util.Set;
import java.util.TreeSet;

public class lvl_6_task_2 {
    public static void main(String[] args) {
        Set<Soldier> soldiers = new TreeSet<>();
        soldiers.add(new Soldier("Ivanov", 170));
        soldiers.add(new Soldier("Petrov", 180));
        soldiers.add(new Soldier("Sidorov", 175));

        for (Soldier soldier : soldiers) {
            System.out.println(soldier.name);
        }
    }

    public static class Soldier implements Comparable<Soldier> {
        private String name;
        private int height;

        public Soldier(String name, int height) {
            this.name = name;
            this.height = height;
        }

        public int compareTo(Soldier o) {
            return o.height - height;
        }
    }
}
