package cn.ibizlab.runner.servicerunner.harness;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Locates the Spring-managed coordinator for Runtime-created service objects.
 *
 * <p>Entity services are created by the iBiz Runtime through reflection in
 * multi-instance mode, so Spring field injection does not run for those
 * instances.</p>
 */
@Component
public class HarnessCoordinatorLocator implements ApplicationContextAware {

    private static volatile ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        HarnessCoordinatorLocator.applicationContext = applicationContext;
    }

    public static HarnessCoordinator getRequired() {
        ApplicationContext context = applicationContext;
        if (context == null) {
            throw new IllegalStateException("Spring ApplicationContext is not ready for HarnessCoordinator");
        }
        return context.getBean(HarnessCoordinator.class);
    }
}
