package CollectionsTPSuivie;

import java.util.Comparator;

class Cercle {
    public Cercle(int x,int y, double rayon){
        this.x=x; this.y=y; this.rayon=rayon;
    }
    public void display(){
        System.out.println("\nCoordonnees: "+x+","+y+" ; rayon: "+rayon);
    }
    public double getRayon(){return rayon;}
    public int getX(){return x;}
    private int x,y;
    double rayon;
}

class Comparateur implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        if(o1 instanceof Cercle && o2 instanceof Cercle){
            if(((Cercle) o1).getRayon() > ((Cercle) o2).getRayon()) return 1;
            if(((Cercle) o1).getRayon() < ((Cercle) o2).getRayon()) return -1;
            return 0;
        }
        return 2;
    }
}
