package TPDIAGRAMMEDECLASSE;

import java.util.ArrayList;

class Qcm extends Question{
    public Qcm(String enonce) {
        super(enonce);
    }
    ArrayList<Reponse> reponses;
    String getText(String t){
        String Chaine="";

        for(Reponse r : reponses ){
            Chaine+=r.texte;
        }
        return Chaine;
    }
    public void addReponse(String texte,boolean validite){
        reponses.add(new Reponse(texte,validite));
    }
    public void addReponse(Reponse r){
        reponses.add(r);
    }
}