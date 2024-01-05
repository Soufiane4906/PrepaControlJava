package SoufianeG6_TP_Generics.Exo2;

public class Main {
    public static void main(String[] args) {
        Triplet t = new Triplet(1, 2, 3);
        Triplet t1 = new Triplet("salam", "salut", "cava");
        t.display();
        t1.display();
        TripletH t2 = new TripletH(1, "abc", 2.3);
        t2.afficher();
    }
}