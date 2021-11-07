package Level_2.lvl_2_task_12;

import Level_2.lvl_2_task_12.contex.InitialContext;
import Level_2.lvl_2_task_12.service.Service;

public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    /**
     * First, check for a service object in the cache
     * If a service object is not in the cache, perform a lookup using
     * the JNDI initial context and get the service object. Add it to
     * the cache for future use.
     *
     * @param jndiName The name of the service object in the context
     * @return Object mapped to the name in context
     */
    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        service = (Service) context.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
