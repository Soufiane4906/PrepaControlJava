package SoufianeG6_TP_Generics.Exo2;

public class TripletH<T,U,V> {
    private T premier;
    private U second;
    private V troisieme;
    public TripletH(T premier, U second, V troisieme) {
        this.premier = premier;
        this.second = second;
        this.troisieme = troisieme;
    }
    public T getpremier() {
        return premier;
    }
    public U getsecond() {
        return second;
    }
    public V gettroisieme() {
        return troisieme;
    }
    public void afficher()
    {
        System.out.println("1er "+getpremier()+"\n2eme "+getsecond()+"\n3eme "+gettroisieme());
                System.out.println("\n");
    }
}
