package CollectionsTPSuivie;

import java.util.LinkedList;
import java.util.ListIterator;

public class TriListe {
    LinkedList<String> ListC;
    public TriListe(){
        this.ListC = new LinkedList<>();
    }
    boolean Add(String chaine){
        ListIterator<String> iter = ListC.listIterator();
        boolean flag=false;    //flag signifie found or not found.
        while(iter.hasNext() && !flag){
            if(iter.next().compareTo(chaine) > 0){
                flag = true;
            }
        }
        if(flag){
            iter.previous();
            ListC.add(chaine);
            return flag;
        }
        return flag;
    }
    public void display(){
        for(String s: ListC) System.out.println(s);
    }
}
