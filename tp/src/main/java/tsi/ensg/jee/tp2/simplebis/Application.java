package tsi.ensg.jee.tp2.simplebis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config-simpleter.xml");
        QuestionsService questionService = (QuestionsService) context.getBean("questionsService");
        String strQuestion = questionService.getQuestion();
        System.out.print(strQuestion);
    }
}
