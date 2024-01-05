package SoufianeG6_TP_Generics.Exo2;

public class Triplet<T> {
    private T Premier;
    private T Second;
    private T Troiseme;
    public Triplet(T premier, T second, T troiseme) {
        Premier = premier;
        Second = second;
        Troiseme = troiseme;
    }
    public T getPremier() {
        return Premier;
    }
    public T getSecond() {
        return Second;
    }
    public T getTroiseme() {
        return Troiseme;
    }
    public void display()
    {
        System.out.println("1er "+getPremier()+"\n2eme "+getSecond()+"\n3eme"+getTroiseme());
                System.out.println("\n");
    }
}
