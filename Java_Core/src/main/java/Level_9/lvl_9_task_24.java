package Level_9;

/*
Замена чисел
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lvl_9_task_24 {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fileIn = new FileReader(fileName);
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        char ch;
        while (fileIn.ready()) {
            ch = (char) fileIn.read();
            if (ch != '\n') {
                sb.append(ch);
            } else {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }
        if (!"".equals(sb.toString())) {
            list.add(sb.toString());
        }
        fileIn.close();
        for (String str : list) {
            String[] strings = str.split(" ");
            for (int i = 0; i < strings.length; i++) {
                String st = strings[i];
                try {
                    if (map.containsKey(Integer.valueOf(st))) {
                        strings[i] = map.get(Integer.valueOf(st));
                    }
                } catch (NumberFormatException e) {
                }
            }
            for (String s : strings) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
