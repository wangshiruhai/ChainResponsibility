import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.PrinterChain;
import spring.User;

/**
 * @author wangshihai
 * @date 2021-07-17
 */
public class App {

    public static void main( String[] args ){
        //测试使用spring的autowred list 模拟简单责任链
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        PrinterChain printerChain = (PrinterChain) context.getBean("printerChain");
        printerChain.introduceUser(new User("Marco Castigliego", 'M'));
        printerChain.introduceUser(new User("Julie Marot", 'F'));
    }
}
