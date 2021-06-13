package Level_8;

/*
Самые редкие байты
*/

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lvl_8_task_4 {
    public List<Integer> integerList = new ArrayList<Integer>();
    public Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    public List<Integer> countList = new ArrayList<Integer>();

    public static void main(String[] args) throws Exception {
        Map<Byte, Integer> letters = new HashMap<Byte, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();
        FileInputStream in = new FileInputStream(new File(file));
        byte[] buffer = new byte[in.available()];

        if (in.available() > 0) {
            in.read(buffer);
        }
        in.close();
        for (byte c : buffer) {
            int count = 0;
            for (byte c1 : buffer) {
                if (c == c1)
                    count++;
            }
            letters.put(c, count);
        }
        int Maxbyte = 1000;
        for (Map.Entry<Byte, Integer> pair : letters.entrySet()) {
            if (pair.getValue() < Maxbyte)
                Maxbyte = pair.getValue();
        }
        for (Map.Entry<Byte, Integer> pair : letters.entrySet()) {
            if (pair.getValue().equals(Maxbyte))
                System.out.print(pair.getKey() + " ");
        }
    }
}
