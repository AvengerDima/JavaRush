package Level_9;

/*
Отслеживаем изменения
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lvl_9_task_16 {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader rcon = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(rcon.readLine()));
        BufferedReader file2 = new BufferedReader(new FileReader(rcon.readLine()));
        rcon.close();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        while (file1.ready()) {
            list1.add(file1.readLine());
        }
        while (file2.ready()) {
            list2.add(file2.readLine());
        }
        file1.close();
        file2.close();
        while (!list1.isEmpty() | !list2.isEmpty()) {
            if (list2.isEmpty()) {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
            }else if (list1.isEmpty()) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            }else if (list1.get(0).equals(list2.get(0))) {
                lines.add(new LineItem(Type.SAME, list1.get(0)));
                list1.remove(0);
                list2.remove(0);
            } else if (list1.get(0).equals(list2.get(1))) {
                lines.add(new LineItem(Type.ADDED, list2.get(0)));
                list2.remove(0);
            } else {
                lines.add(new LineItem(Type.REMOVED, list1.get(0)));
                list1.remove(0);
            }
        }
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
