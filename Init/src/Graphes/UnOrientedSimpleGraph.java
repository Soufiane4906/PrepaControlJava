package Graphes;

public class UnOrientedSimpleGraph extends UnOrientedGraph{


    public UnOrientedSimpleGraph() {
        super();
    }

    @Override
    public boolean addArrete(Sommet s1, Sommet s2) {
    if (this.getArrete(s1,s2)==null) return this.addArrete(s1,s2);
    else return false;
    }

    @Override
    public boolean removeArrete(Sommet S1, Sommet S2) {
        if (this.getArrete(S1,S2)!=null) return this.removeArrete(S1,S2);
        else return false;
    }
}
