package spring;

import org.springframework.core.Ordered;

/**
 * @author wangshihai
 * @date 2021-07-17
 */
public abstract class GenericPrinter implements Printer,Ordered {

    @Override
    public void print(User user) {
        String prefix = "Mr";
        if (user.getGender() == 'F') {
            prefix = "Mrs";
        }
        System.out.println(getGreeting() + ' ' + prefix + ' ' + user.getName());
    }

    protected abstract String getGreeting();

    @Override
    public int getOrder() {
        return Ordered.LOWEST_PRECEDENCE;
    }
}
