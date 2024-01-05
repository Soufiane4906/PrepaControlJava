package SoufianeG6_TP_Generics.Exo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compare<K extends Comparable<K>,V> {

    ArrayList<Pair<K,V>> p;
    public Compare(ArrayList<Pair<K, V>> p) {
        this.p = p;
    }

    public void ajoutPair( K cle,V valeur){
        p.add(new Pair<>(cle,valeur));
/*
        p.sort(Comparator.comparing(Pair::getKey));
*/
        Collections.sort(p,Comparator.comparing(Pair::getKey));
    }

    public String print() {
       String message="";
       for( Pair pp : this.p){

           message+=pp.toString();

       }

        return message;
    }
}

