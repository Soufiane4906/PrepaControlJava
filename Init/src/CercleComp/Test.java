
package CercleComp;
import CercleComp.Cercle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Test {
    public static void main(String[] args) {
        Cercle c1=new Cercle(10,14,23);
        Cercle c2=new Cercle(9,4,81);
        Cercle c3=new Cercle(10,4,30);
        ArrayList<Cercle> ListC= new ArrayList<>();
        ListC.add(c1);
        ListC.add(c2);
        ListC.add(c3);
        System.out.println("Avant le tri !");
        for (Cercle c: ListC) c.display();
        Collections.sort(ListC,new Comparateur1());
        System.out.println("Apres le tri !");
        Collections.sort(ListC, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Integer) ((Cercle)
                        o1).getR()).compareTo(((Integer) ((Cercle) o2).getR()));
            }
        });
    }
}
// Methode 02

