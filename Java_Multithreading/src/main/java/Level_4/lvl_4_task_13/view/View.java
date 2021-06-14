package Level_4.lvl_4_task_13.view;

import Level_4.lvl_4_task_13.controller.Controller;
import Level_4.lvl_4_task_13.model.ModelData;

public interface View {
    void refresh(ModelData modelData);
    void setController(Controller controller);
}
