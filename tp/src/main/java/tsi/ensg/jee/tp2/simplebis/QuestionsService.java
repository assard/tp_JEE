package tsi.ensg.jee.tp2.simplebis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.Random;

public class QuestionsService {

    @Autowired
    @Qualifier("QuestionsJavaAvance")
    private Questions questions;

    public QuestionsService(){
        this.questions = null;
    }

    public QuestionsService(Questions questions){
        this.questions = questions;
    }

    public void setQuestions(Questions questions) {
        this.questions = questions;
    }

    public String getQuestion(){
        int random = new Random().nextInt(3);
        return questions.questions().get(random);
    }

}
