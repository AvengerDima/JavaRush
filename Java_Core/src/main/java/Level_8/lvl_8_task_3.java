package Level_8;

/*
Самые частые байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream file = new FileInputStream(fileName);
        ArrayList<Integer> bytes = new ArrayList<>();

        while (file.available() > 0) {
            bytes.add(file.read());
        }

        file.close();

        HashMap<Integer, Integer> map = new HashMap<>();

        initMapBytesCount(bytes, map);

        print(map, getMaxCount(map));
    }

    public static void print(HashMap<Integer, Integer> map, int maxCount){
        for(Map.Entry<Integer, Integer> pair : map.entrySet() ) {
            if (pair.getValue() == maxCount)
                System.out.print(pair.getKey() + " ");
        }
    }

    public static int getMaxCount(HashMap<Integer, Integer> map){
        int maxCount = 0;

        for(Map.Entry<Integer, Integer> pair : map.entrySet() ) {
            if (pair.getValue() > maxCount)
                maxCount = pair.getValue();
        }
        return maxCount;
    }

    public static void initMapBytesCount(ArrayList<Integer> bytes, HashMap<Integer, Integer> map){
        for (int i = 0; i < bytes.size() - 1; i++) {
            int countSameBytes = 0;

            for (int n = i + 1; n < bytes.size(); n++){
                if (bytes.get(n) == bytes.get(i))
                    countSameBytes++;
            }

            boolean contains = false;

            for(Map.Entry<Integer, Integer> pair : map.entrySet() ) {
                if (pair.getKey() == bytes.get(i)){
                    contains = true;
                }
            }

            if(!contains) {
                map.put(bytes.get(i), countSameBytes);
            }
        }
    }
}
