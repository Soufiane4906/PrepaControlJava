package CercleComp;

import java.util.Comparator;

class Comparateur1 implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        if (o1 instanceof Cercle && o2 instanceof Cercle){

            if (((Cercle) o1).getR() > ((Cercle) o2).getR()) return 1;
            if (((Cercle) o1).getR() < ((Cercle) o2).getR()) return -1;
            return 0;
        }
        return 2;
    }

    /*    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Cercle && o2 instanceof
                Cercle){
            if (((Cercle) o1).getR() > ((Cercle)
                    o2).getR()) return 1;
            if (((Cercle) o1).getR() < ((Cercle)
                    o2).getR()) return -1;
            return 0;
        }
        return 2;
    }*/
}