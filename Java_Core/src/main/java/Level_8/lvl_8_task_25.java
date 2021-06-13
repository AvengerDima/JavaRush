package Level_8;

/*
Собираем файл
*/

import java.io.*;
import java.util.TreeSet;

public class lvl_8_task_25 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        TreeSet<String> fileSet = new TreeSet<>();
        String str;
        while (!(str = reader.readLine()).equals("end")) {
            fileSet.add(str);
        }
        reader.close();
        String firstFileName = fileSet.first();
        FileOutputStream fileOut = new FileOutputStream(firstFileName.substring(0, firstFileName.lastIndexOf('.')), true);

        for (String fileName : fileSet) {
            FileInputStream fileIn = new FileInputStream(fileName);
            if (fileIn.available() > 0) {
                byte[] buffer = new byte[fileIn.available()];
                fileIn.read(buffer);
                fileOut.write(buffer);
            }
            fileIn.close();
        }
        fileOut.close();
    }
}
