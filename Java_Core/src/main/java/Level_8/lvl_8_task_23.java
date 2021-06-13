package Level_8;

/*
Нити и байты
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_23 {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        String fileName;
        while(!(fileName = reader.readLine()).equals("exit")){
            names.add(fileName);
        }

        for(String s : names){
            new ReadThread(s).start();
        }

        reader.close();
    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            HashMap<Byte, Integer> map = new HashMap<>();
            byte[] data = new byte[0];
            int max = Integer.MIN_VALUE;
            byte res = Byte.MIN_VALUE;

            try {
                FileInputStream in = new FileInputStream(this.fileName);
                while(in.available() > 0){
                    data = new byte[in.available()];
                    in.read(data);
                }
                in.close();
            } catch (IOException e) {
                //NOP
            }

            for(byte b : data){
                if(map.containsKey(b)){
                    int count = map.get(b) + 1;
                    map.put(b, count);
                } else {
                    map.put(b, 1);
                }
            }

            for(Map.Entry<Byte, Integer> entry : map.entrySet()){
                if(entry.getValue() > max){
                    max = entry.getValue();
                    res = entry.getKey();
                }
            }

            synchronized (resultMap){
                resultMap.put(this.fileName, (int)res);
            }
        }
    }
}
