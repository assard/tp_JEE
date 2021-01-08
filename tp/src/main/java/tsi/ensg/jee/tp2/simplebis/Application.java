package tsi.ensg.jee.tp2.simplebis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        QuestionsService questionService = context.getBean(QuestionsService.class);
        String strQuestion = questionService.getQuestion();
        System.out.print(strQuestion);
    }
}
