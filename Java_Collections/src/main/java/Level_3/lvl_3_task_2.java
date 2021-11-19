package Level_3;

/*
Вторая сериализация в JSON
*/

import java.io.IOException;
import java.io.StringWriter;

public class lvl_3_task_2 {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 3;

        StringWriter writer = new StringWriter();
        convertToJSON(writer, cat);
        System.out.println(writer.toString());
    }

    public static void convertToJSON(StringWriter writer, Object object) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(writer, object);
    }

    @JsonAutoDetect
    public static class Cat {
        @JsonProperty(value = "wildAnimal")
        public String name;

        @JsonIgnore
        public int age;

        @JsonProperty(value = "over")
        public int weight;

        Cat() {
        }
    }
}
