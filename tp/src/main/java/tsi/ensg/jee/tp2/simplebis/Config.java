package tsi.ensg.jee.tp2.simplebis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Bean
    public QuestionsJava QuestionsJava(){
        QuestionsJava questionsJava = new QuestionsJava();
        List<String> questions = new ArrayList<String>();
        questions.add("What's the first name of professor Slughorn ?");
        questions.add("What's the first name of professor Flitwick ?");
        questions.add("What's the first name of professor Hagrid ?");
        questionsJava.setQuestions(questions);
        return questionsJava;
    }

    @Bean
    public QuestionsJavaAvance QuestionsJavaAvance(){
        QuestionsJavaAvance questionsJavaAvance = new QuestionsJavaAvance();
        List<String> questions = new ArrayList<String>();
        questions.add("What's the house of Seamus Finnigan ?");
        questions.add("What's the house of Cho Chang ?");
        questions.add("What's the house of Pansy Parkinson ?");
        questionsJavaAvance.setQuestions(questions);
        return questionsJavaAvance;
    }

    @Bean
    public QuestionsService QuestionsService(){
        return new QuestionsService();
    }

}
