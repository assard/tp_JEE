package tsi.ensg.jee.tp2.exo2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import tsi.ensg.jee.tp2.simplebis.Config;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigLibrary.class);
        Library library = context.getBean(Library.class);
        System.out.println(library.toString());
    }

}
