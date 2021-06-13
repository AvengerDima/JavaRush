package Level_8;

/*
Округление чисел
*/

import java.io.*;

public class lvl_8_task_20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File fileOne = new File((reader.readLine()));
        File fileTwo = new File((reader.readLine()));

        BufferedReader readerOne = new BufferedReader(new FileReader(fileOne));
        String[] buffer = readerOne.readLine().split(" ");
        readerOne.close();

        BufferedWriter writer = new BufferedWriter(new FileWriter(fileTwo));
        for (String s : buffer) {
            writer.write((int) Math.round(Double.parseDouble(s)) + " ");
        }

        writer.close();
    }
}
