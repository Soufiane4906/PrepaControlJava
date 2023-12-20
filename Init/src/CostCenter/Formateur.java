package CostCenter;

import java.util.ArrayList;

abstract class Formateur {
    String nom;
    String prenom;
    int nbr_heures;
    ArrayList<String> compétences;
    static double charges=1;
    static double salaire=2000 ;
    public Formateur() {
        this.compétences= new ArrayList<>();
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Formateur){
            for(String comp : compétences ){
                if(!((Formateur) obj).compétences.contains(comp)) return false;
            }
            return ((Formateur) obj).compétences.size()==this.compétences.size();
        }
        return false;
    }
    void addComp(String comp){
        compétences.add(comp);

    }
    void RemoveComp(String comp){
        compétences.remove(comp);
    }
    public Formateur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.compétences= new ArrayList<>();
    }

    public Formateur(String nom, String prenom, int nbr_heures) {
        this.nom = nom;
        this.prenom = prenom;
        this.nbr_heures = nbr_heures;
        this.compétences = new ArrayList<>();
    }
    public void setCompétences(ArrayList<String> compétences) {
        this.compétences = compétences;
    }
    public abstract double cout ();
}