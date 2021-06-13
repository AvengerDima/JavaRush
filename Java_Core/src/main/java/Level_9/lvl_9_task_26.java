package Level_9;

/*
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_9_task_26 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1 = new BufferedReader(new FileReader(reader.readLine()));

        while (file1.ready()) {
            String s = file1.readLine();
            StringBuilder gg = new StringBuilder(s);
            gg.reverse();
            System.out.println(gg.toString());
        }

        reader.close();
        file1.close();
    }
}
