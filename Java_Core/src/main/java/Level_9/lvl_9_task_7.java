package Level_9;

/*
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_9_task_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()));

        int count = 0;
        while (fileReader.ready()) {
            String line = fileReader.readLine().replaceAll("[^a-zA-Z]", ",");
            String[] aLine = line.split(",");
            for (int i = 0; i < aLine.length; i++) {
                if (aLine[i].equals("world")) {
                    count++;
                }
            }
        }

        reader.close();
        fileReader.close();

        System.out.println(count);
    }
}
