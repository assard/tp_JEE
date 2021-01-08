package tsi.ensg.jee.onlineshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-online.xml");
        OnlineShop amazon = (OnlineShop) context.getBean("onlineShop");
        amazon.printDescription();
    }

}
