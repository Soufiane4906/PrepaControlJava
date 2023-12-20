package CercleComp;

import java.util.Comparator;
public class Cercle {
    private int x,y, r;
    public Cercle(int x, int y, int r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getR() {
        return r;
    }
    public void display() {
        System.out.println("Cordonnées de ce cercle :+  x= "+x+" y= "+y+" +rayon+ "+r);
    }
}
