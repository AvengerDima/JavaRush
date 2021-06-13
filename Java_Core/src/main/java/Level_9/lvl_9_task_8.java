package Level_9;

/*
Выделяем числа
*/

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lvl_9_task_8 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fileIn = reader.readLine();
            String fileOut = reader.readLine();
            reader.close();
            BufferedReader fileReader = new BufferedReader(new FileReader(fileIn));
            BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileOut));
            String str = "";
            while ((str = fileReader.readLine()) != null) {
                Pattern p = Pattern.compile("(\\b)[0-9]+(\\s|\\b)");
                Matcher m = p.matcher(str);
                while (m.find()) {
                    fileWriter.write(str.substring(m.start(), m.end()));
                }
            }
            fileReader.close();
            fileWriter.close();

        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
