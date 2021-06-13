package Level_8;

/*
Файлы и исключения
*/

import java.io.*;

public class lvl_8_task_24 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in;
        String fileName;

        while(true) {
            fileName = reader.readLine();
            try{
                in = new FileInputStream(fileName);
                in.close();
            } catch (FileNotFoundException e){
                System.out.println(fileName);
                reader.close();
                break;
            }
        }
    }
}
