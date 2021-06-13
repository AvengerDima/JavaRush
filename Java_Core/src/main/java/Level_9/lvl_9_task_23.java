package Level_9;

/*
Слова с цифрами
*/

import java.io.*;

public class lvl_9_task_23 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        BufferedWriter out = new BufferedWriter(new FileWriter(args[1]));
        while (in.ready()) {
            String line = in.readLine();
            String[] words = line.split(" ");
            for (String word : words) {
                if (word.matches(".*\\d.*"))
                    out.write(word + " ");
            }
        }
        in.close();
        out.close();
    }
}
