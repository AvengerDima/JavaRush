package Level_1;

/*
Глубокое клонирование карты
*/

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class lvl_1_task_7 implements Cloneable {
    public static void main(String[] args) {
        lvl_1_task_7 solution = new lvl_1_task_7();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        lvl_1_task_7 clone = null;
        try {
            clone = solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    @Override
    protected lvl_1_task_7 clone() throws CloneNotSupportedException {
        lvl_1_task_7 solution = new lvl_1_task_7();

        for (Map.Entry<String, User> tmp : this.users.entrySet()) {
            solution.users.put(tmp.getKey(), (User) tmp.getValue().clone());
        }
        return solution;
    }

    public static class User implements Cloneable {
        int age;
        String name;

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        protected User clone() throws CloneNotSupportedException {
            User user = new User(age, name);
            user.age = this.age;
            user.name = this.name;

            return user;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return age == user.age &&
                    Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name);
        }
    }
}
