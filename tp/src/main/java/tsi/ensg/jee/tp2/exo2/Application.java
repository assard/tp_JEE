package tsi.ensg.jee.tp2.exo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-onlineshopsimpler.xml");
        Library library = (Library)context.getBean("library");
        System.out.println(library.toString());
    }

}
