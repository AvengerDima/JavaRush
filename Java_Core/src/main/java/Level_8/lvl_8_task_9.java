package Level_8;

/*
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class lvl_8_task_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(0, data);
        }

        for (int i = 0; i < list.size(); i++) {
            outputStream.write(list.get(i));
        }

        inputStream.close();
        outputStream.close();
    }
}
