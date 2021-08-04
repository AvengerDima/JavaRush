package Level_9.lvl_9_task_13;

import Level_9.lvl_9_task_13.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    //Вывод message в консоль
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    //Чтение строки с консоли
    public static String readString() throws IOException {
        return bufferedReader.readLine();
    }

    //Выбор блюда пользователем и добавление его в список
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        ConsoleHelper.writeMessage("Please choose a dish from the list: " + Dish.allDishesToString() + "\n or type 'exit' to complete the order");
        while (true) {
            String dishName = ConsoleHelper.readString().trim();
            if ("exit".equals(dishName)) {
                break;
            }
            try {
                Dish dish = Dish.valueOf(dishName);
                dishes.add(dish);
                writeMessage(dishName + " has been successfully added to your order");
            } catch (Exception e) {
                writeMessage(dishName + " hasn't been detected");
            }
        }
        return dishes;
    }
}
