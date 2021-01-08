package tsi.ensg.jee.tp2.simplebis;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions {

    private List<String> questions;

    public QuestionsJava(){
        this.questions = new ArrayList<String>();
    }

    public void setQuestions(List<String> questions){
        this.questions = List.copyOf(questions);
    }

    @Override
    public List<String> questions() {
        return questions;
    }
}
