package Level_1.lvl_1_task_13;

/*
Ипподром(16)
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_1_task_13 extends Thread {
    private List<Horse> horses; //список лошадей
    public static lvl_1_task_13 game;

    public List<Horse> getHorses() {
        return horses;
    }

    public lvl_1_task_13(List<Horse> horses) {
        this.horses = horses;
    }

    public void run() { //Управляем всем
        for (int i = 0; i < 100; i++) { //Наш забег
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() { //Управляем движением всех лошадей
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() { //Отрисовываем объекты на экран
        for (Horse horse : horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() { //Лошадь пробежавшая самую большую дистанцию
        double max = 0;
        Horse winner = null;

        for (Horse horse: getHorses()) {
            if (horse.getDistance() >= max) {
                max = horse.getDistance();
                winner = horse;
            }
        }
        return winner;
    }

    public void printWinner() { //Выводим имя победителя
        Horse win = getWinner();
        System.out.println("Winner is " + win.getName() + "!");
    }

    public static void main(String[] args) {
        game = new lvl_1_task_13(new ArrayList<>());
        Horse horse1 = new Horse("Гомер", 3, 0);
        Horse horse2 = new Horse("Лаки", 3, 0);
        Horse horse3 = new Horse("Слевин", 3, 0);
        game.horses.add(horse1);
        game.horses.add(horse2);
        game.horses.add(horse3);
        game.run();
        game.printWinner();
    }
}
