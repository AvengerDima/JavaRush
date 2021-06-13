package Level_9;

/*
Четные символы
*/

import java.io.*;

public class lvl_9_task_6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());

        int count = 1;
        while (fileReader.ready()) {
            int data = fileReader.read();
            if (count % 2 == 0) {
                fileWriter.write(data);
            }
            count++;
        }

        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
