package Level_3.lvl_3_task_8;

/*
Сериализация даты в JSON
*/

public class lvl_3_task_8 {
    public static void main(String[] args) throws JsonProcessingException {
        Event event = new Event("event#1");

        String result = new ObjectMapper().writeValueAsString(event);

        System.out.println(result);
    }
}
