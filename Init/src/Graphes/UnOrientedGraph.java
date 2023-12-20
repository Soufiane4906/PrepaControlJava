package Graphes;

import java.util.ArrayList;

public abstract class UnOrientedGraph implements Modelisable {

    private ArrayList<Sommet> sommets;
    private ArrayList<Arrete> arretes;

    public UnOrientedGraph(){

        this.sommets = new ArrayList<Sommet>(); // Allocation is required
        this.arretes = new ArrayList<Arrete>();
    }

    @Override
    public boolean addSommet(int N) {
        return this.sommets.add(new Sommet(N));
    }

    @Override
    public boolean RemoveSommet(Sommet s) {
        boolean flag=this.sommets.remove(s);

        if(flag){
            for (Arrete arr : this.arretes){
                if (arr.lien(s)) this.arretes.remove(arr);
            }
        }
        return false;
    }


    @Override
    public Arrete getArrete(Sommet from, Sommet to) {
        for(Arrete ar : this.arretes){
            if( ( ar.fromTo(from,to) ) || (ar.fromTo(to,from))) return ar;
        }
        return null;
    }





@Override

public boolean equals(Object obj) {
    if( obj instanceof UnOrientedGraph && ((UnOrientedGraph) obj).sommets.size()==this.sommets.size()){

    for(Sommet s : this.sommets){
        if(((UnOrientedGraph) obj).sommets.contains(s)) return true;
    }
    }
    return false;
}

/*
    if( obj instanceof UnOrientedGraph && ((UnOrientedGraph) obj).sommets.size()==this.sommets.size()){
*/

}


















   /* @Override
    public boolean equals(Object obj) {
        if( obj instanceof UnOrientedGraph && ((UnOrientedGraph) obj).sommets.size()==this.sommets.size()){
            for (Sommet s : sommets){
                if ( !((UnOrientedGraph) obj).sommets.contains(s)){
                    return false;
                }
            }
            return true;
        }
        return false;
    }*/



