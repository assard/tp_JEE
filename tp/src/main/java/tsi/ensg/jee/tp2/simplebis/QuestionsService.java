package tsi.ensg.jee.tp2.simplebis;

import java.util.Random;

public class QuestionsService {

    private Questions questions;

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
