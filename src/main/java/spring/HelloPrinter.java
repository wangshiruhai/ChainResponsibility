package spring;

import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * @author wangshihai
 * @date 2021-07-17
 */
@Component
public class HelloPrinter extends GenericPrinter {
    private static final String GREETING = "Hello";

    @Override
    protected String getGreeting() {
        return GREETING;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }
}
