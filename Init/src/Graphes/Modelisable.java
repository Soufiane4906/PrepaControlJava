package Graphes;

public interface Modelisable {
    boolean addSommet(int N);

    boolean RemoveSommet(Sommet s);
    boolean addArrete(Sommet s1, Sommet s2);
    boolean removeArrete(Sommet S1, Sommet S2);
    Arrete getArrete(Sommet from, Sommet to);
}