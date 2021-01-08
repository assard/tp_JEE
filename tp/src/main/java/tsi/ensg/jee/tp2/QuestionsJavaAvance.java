package tsi.ensg.jee.tp2;

import java.util.ArrayList;
import java.util.List;

public class QuestionsJavaAvance implements Questions{

    private List<String> questions;

    public QuestionsJavaAvance(){
        this.questions = new ArrayList<String>();
        questions.add("What's the house of Ronald Weasley ?");
        questions.add("What's the house of Draco Malfoy ?");
        questions.add("What's the house of Cedric Diggory?");
    }

    @Override
    public List<String> questions() {
        return questions;
    }
}
