package Level_10;

/*
Знакомство с properties
*/

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class lvl_10_task_3 {
    public static Map<String, String> properties = new HashMap<>();

    public void fillInPropertiesMap() {
        //implement this method - реализуйте этот метод
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream inputStream = new FileInputStream(reader.readLine())) {

            load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void save(OutputStream outputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propertiesSave = new Properties();
        if (!properties.isEmpty()) {
            for (Map.Entry entry : properties.entrySet()) {
                propertiesSave.setProperty(entry.getKey().toString(), entry.getValue().toString());
            }
        }
        propertiesSave.store(outputStream, null);
        outputStream.close();
    }

    public void load(InputStream inputStream) throws Exception {
        //implement this method - реализуйте этот метод
        Properties propertiesLoad = new Properties();
        propertiesLoad.load(inputStream);
        for (final String name : propertiesLoad.stringPropertyNames()) {
            properties.put(name, propertiesLoad.getProperty(name));
        }
        inputStream.close();
    }

    public static void main(String[] args) {

    }
}
