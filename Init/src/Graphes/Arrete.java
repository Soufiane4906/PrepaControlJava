package Graphes;

public class Arrete {
    private Sommet from, to;

    //  DEFAULT CONSTRUCTOR
    public Arrete(){

    }
    //   CONSTRUCTOR WITH PARAMS
    public Arrete(Sommet from , Sommet to){
        this.from=from;
        this.to=to;
    }

    /* "LIEN" IS A METHOD THAT RETURNS A BOOLEAN VALUE INDICATING WHETHER THERE IS
    A LINK BETWEEN THE CURRENT EDGE (ARRETE EN COURS) AND THE SPECIFIED NODE (SOMMET) PASSED AS A PARAMETER.
     */

    public boolean lien(Sommet s){

        if (this.from.equals(s) || this.to.equals(s)) return true;
else return false;
 /*       return this.from.equals(s) || this.to.equals(s);*/
    }

    public boolean fromTo(Sommet from, Sommet to){
     /*   return this.from.equals(from) && this.to.equals(to);*/

        if(this.from.equals(from) && this.to.equals(to)) return true;

        else return false;


    }
}

