package Level_2.lvl_2_task_12.service.impl;

import Level_2.lvl_2_task_12.service.Service;

public class EJBServiceImpl implements Service {

    @Override
    public void execute() {
        System.out.println("Executing the EJBService");
    }

    @Override
    public String getName() {
        return "EJBService";
    }
}
