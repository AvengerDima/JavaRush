package Level_4.lvl_4_task_13;

/*
MVC
*/

import Level_4.lvl_4_task_13.controller.Controller;
import Level_4.lvl_4_task_13.model.MainModel;
import Level_4.lvl_4_task_13.model.Model;
import Level_4.lvl_4_task_13.view.EditUserView;
import Level_4.lvl_4_task_13.view.UsersView;

public class lvl_4_task_13 { //эмулятор пользователя
    public static void main(String[] args) {
        Model model = new MainModel();
        UsersView usersView = new UsersView();
        EditUserView editUserView = new EditUserView();
        Controller controller = new Controller();

        usersView.setController(controller);
        editUserView.setController(controller);

        controller.setModel(model);
        controller.setUsersView(usersView);
        controller.setEditUserView(editUserView);

        usersView.fireEventShowAllUsers();
        usersView.fireEventOpenUserEditForm(126L);
        editUserView.fireEventUserDeleted(124L);
        editUserView.fireEventUserChanged("Amigo", 126L, 25);
        usersView.fireEventShowDeletedUsers();
    }
}
