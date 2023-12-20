package TPDIAGRAMMEDECLASSE;

import java.util.ArrayList;
public class Question {
    String Enonce;
    int difficulte = 40;
    public Question(String enonce) {
        Enonce = enonce;
    }
    public String getEnonce() {
        return Enonce;
    }
    public int getDifficulte() {
        return difficulte;
    }
    public void setDifficulte(int difficulte) {
        this.difficulte = difficulte;
    }
}