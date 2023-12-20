package TPDIAGRAMMEDECLASSE;

public class QuestionNotee {
    Question Q;
    private int Points;
    public QuestionNotee(Question q, int points) {
        Q = q;
        Points = points;
    }
    public int getPoints() {
        return Points;
    }
    public int getdifficulte(){

        return Q.getDifficulte();
    }
    public void setdifficulte(int diff){
        Q.setDifficulte(diff);
    }
    public String getEnonce(){
        return Q.getEnonce();
    }
}