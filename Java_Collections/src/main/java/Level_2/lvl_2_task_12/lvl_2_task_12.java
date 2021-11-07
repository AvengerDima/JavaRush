package Level_2.lvl_2_task_12;

/*
Service Locator
*/

import Level_2.lvl_2_task_12.service.Service;

public class lvl_2_task_12 {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("EJBService");
        service.execute();
        System.out.println();
        service = ServiceLocator.getService("JMSService");
        service.execute();
    }
}
