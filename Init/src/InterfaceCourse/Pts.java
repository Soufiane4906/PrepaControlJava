package InterfaceCourse;

public class Pts implements Deplaçable{
    double X;
    double Y;
    public Pts(double x, double y) {
        X = x;
        Y = y;
    }
    @Override
    public double getX() {
        return X ;
    }
    @Override
    public double getY() {

        return Y;
    }

    public void positionner(double x, double y) {
        this.X=x;
        this.Y=y;
    }
    @Override
    public void deplacer(double dx, double dy) {
        this.X+=dx;
        this.Y+=dy;
    }
}