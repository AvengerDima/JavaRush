package Level_2;

/*
StringTokenizer
*/

import java.util.ArrayList;
import java.util.StringTokenizer;

public class lvl_2_task_12 {
    public static void main(String[] args) {
        for (String s : getTokens("level22.lesson13.task01", ".")) {
            System.out.println(s);
        }
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query, delimiter);
        ArrayList<String> list = new ArrayList<>();
        while (tokenizer.hasMoreTokens()) {
            list.add(tokenizer.nextToken());
        }
        String[] token = new String[list.size()];
        return list.toArray(token);
    }
}
