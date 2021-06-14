package Level_4.lvl_4_task_8;

/*
Как избежать Copy+Paste
*/

import java.util.List;

public class lvl_4_task_8 {
    public static void main(String[] args) {
        List<Pet> pet = Util.getPets();
        List<Sayable> pets = Util.convertPetToSayable(pet);
        Util.printDialog(pets);
    }
}
