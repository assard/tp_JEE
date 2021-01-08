package tsi.ensg.jee.tp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        var printer = (MessagePrinter) context.getBean("bean_id");
        printer.printMessage();
    }
}

