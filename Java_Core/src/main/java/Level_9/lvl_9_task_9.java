package Level_9;

/*
Замена знаков
*/

import java.io.*;

public class lvl_9_task_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader BufFileReader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedWriter BufFileWriter = new BufferedWriter(new FileWriter(reader.readLine()));

        while (BufFileReader.ready()) {
            String data = BufFileReader.readLine();
            data = data.replaceAll("\\.", "!");
            BufFileWriter.write(data);
            BufFileWriter.newLine();
        }

        reader.close();
        BufFileReader.close();
        BufFileWriter.close();
    }
}
