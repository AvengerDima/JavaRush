package Level_10.lvl_10_task_13;

import javax.swing.*;

public class lvl_10_task_13 { //Точка входа в наше приложение
    public static void main(String[] args) {
        Model model = new Model();
        Controller controller = new Controller(model);

        JFrame game = new JFrame();
        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        game.add(controller.getView());


        game.setLocationRelativeTo(null);
        game.setVisible(true);
    }

}
