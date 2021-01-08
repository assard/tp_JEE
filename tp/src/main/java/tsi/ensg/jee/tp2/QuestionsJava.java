package tsi.ensg.jee.tp2;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJava implements Questions{

    private List<String> questions;

    public QuestionsJava(){
        this.questions = new ArrayList<String>();
        questions.add("What's the first name of professor Dumbledore ?");
        questions.add("What's the first name of professor McGonagal ?");
        questions.add("What's the first name of professor Snape ?");
    }

    @Override
    public List<String> questions() {
        return questions;
    }
}
