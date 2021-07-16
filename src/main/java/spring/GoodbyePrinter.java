package spring;

import org.springframework.stereotype.Component;

/**
 * @author wangshihai
 * @date 2021-07-17
 */
@Component
public class GoodbyePrinter extends GenericPrinter {
    private static final String GREETING = "Goodbye";

    @Override
    protected String getGreeting() {
        return GREETING;
    }

    @Override
    public int getOrder() {
        return 2;
    }
}
