package TPDIAGRAMMEDECLASSE;

import java.util.ArrayList;

public class SujetExamen {
    ArrayList<QuestionNotee> questions;
    public SujetExamen() {
        this.questions = new ArrayList<>();
    }
    public void addQuestion(QuestionNotee q){
        questions.add(q);
    }
    public void removeQuestion(QuestionNotee q){
        questions.remove(q);
    }
    public int difficulteMoyenne(){
        int somme=0;
        for(QuestionNotee q : questions ){
            somme+=q.getdifficulte();
        }
        return somme/questions.size();
    }
}