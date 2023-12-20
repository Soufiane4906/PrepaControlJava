package CollectionsTPSuivie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test implements Comparator {
    public static void main(String[] args) {
        Cercle c1 = new Cercle(21,22,25);
        Cercle c2 = new Cercle(3,5,8);
        Cercle c3 = new Cercle(10,12,19);
        ArrayList<Cercle> cercles = new ArrayList<>();
        cercles.add(c1);
        cercles.add(c2);
        cercles.add(c3);
        System.out.println("Before sorting !");
        for(Cercle c:cercles) c.display();
        Collections.sort(cercles,new Comparateur());
        System.out.println("After Sorting !");
        for(Cercle c:cercles) c.display();
        /// sorting based on " abscisse "
    }

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Cercle && o2 instanceof Cercle) {
            if (((Integer) (((Cercle) o1).getX())) > ((Integer) (((Cercle) o2).getX()))) return 1;
            if (((Integer) (((Cercle) o1).getX())) < ((Integer) (((Cercle) o2).getX()))) return -1;
            return 0;
        }
        return 2;
    }
}
