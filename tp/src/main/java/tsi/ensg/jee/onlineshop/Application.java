package tsi.ensg.jee.onlineshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigOnlineShop.class);
        OnlineShop amazon = context.getBean(OnlineShop.class);
        amazon.printDescription();
    }

}
