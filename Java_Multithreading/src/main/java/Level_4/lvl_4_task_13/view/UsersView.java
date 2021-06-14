package Level_4.lvl_4_task_13.view;

import Level_4.lvl_4_task_13.bean.User;
import Level_4.lvl_4_task_13.controller.Controller;
import Level_4.lvl_4_task_13.model.ModelData;

public class UsersView implements View { //отображение списка пользователей
    private Controller controller;

    @Override
    public void refresh(ModelData modelData) {
        if (!modelData.isDisplayDeletedUserList()) {
            System.out.println("All users:");
        } else {
            System.out.println("All deleted users:");
        }
        for (User user : modelData.getUsers()) {
            System.out.print("\t");
            System.out.println(user);
        }
        System.out.println("===================================================");
    }

    @Override
    public void setController(Controller controller) {
        this.controller = controller;
    }

    public void fireEventShowAllUsers() { //эмуляция события клиента
        controller.onShowAllUsers();
    }

    public void fireEventShowDeletedUsers() {
        controller.onShowAllDeletedUsers();
    }

    public void fireEventOpenUserEditForm(long id) {
        controller.onOpenUserEditForm(id);
    }
}
