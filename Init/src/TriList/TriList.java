package TriList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
public class TriList {
    LinkedList<String> ListeChaine;
    public TriList(LinkedList<String> listeChaine) {
        ListeChaine = listeChaine;
    }
    public TriList() {
        ListeChaine = new LinkedList<>();
    }
    boolean Add(String chaine){
        ListIterator<String> iter= ListeChaine.listIterator();
        boolean flag= false;
        while(iter.hasNext() && !flag){
            if(iter.next().compareTo(chaine) >0 ) {
                flag= true;
            }
        }
        if(flag) {
            iter.previous();
            ListeChaine.add(chaine);
            return flag;
        }
        return flag;
    }
    public void display(){
        for (String c : ListeChaine) {
            System.out.println(c + "\n");
        }
    }
}