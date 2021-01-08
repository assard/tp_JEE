package tsi.ensg.jee.tp2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-simple.xml");
        QuestionsService questionService = (QuestionsService) context.getBean("genQuestion");
        String strQuestion = questionService.getQuestion();
        System.out.print(strQuestion);
    }
}
