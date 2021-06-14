package Level_4.lvl_4_task_7;

/*
Реализация интерфейса используя локальный класс
*/

import java.util.List;

public class lvl_4_task_7 {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
