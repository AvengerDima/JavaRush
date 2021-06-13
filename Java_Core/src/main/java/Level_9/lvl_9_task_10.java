package Level_9;

/*
Пунктуация
*/

import java.io.*;

public class lvl_9_task_10 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader BufFileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter BufFileWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        String line;
        while ((line = BufFileReader.readLine()) != null) {
            BufFileWriter.write(line.replaceAll("[\\p{P}]", ""));
            BufFileWriter.newLine();
        }

        reader.close();
        BufFileReader.close();
        BufFileWriter.close();
    }
}
