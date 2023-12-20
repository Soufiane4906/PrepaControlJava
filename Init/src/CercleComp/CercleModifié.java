package CercleComp;

public class CercleModifié implements Comparable {
    // i can use
    private int x, y, r;

    public CercleModifié(int x, int y, int r) {
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
        System.out.println("Cordonnées de ce cercle : x= " + x + " y= " + y + " rayon " + r);
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Cercle) {
            if (((Cercle) o).getR() > this.getR()) return -1;
            if (((Cercle) o).getR() < this.getR()) return 1;
            return 0;
        }
        return 2;
    }
}
