package CostCenter;

public class Formateur_Interne extends Formateur {
    public Formateur_Interne() {
    }
    public Formateur_Interne(String nom, String prenom) {
        super(nom, prenom);
    }
    public Formateur_Interne(String nom, String prenom, int nbr_heures) {
        super(nom, prenom, nbr_heures);
    }
    @Override
    public double cout() {
        double cout=2000*12;
        if (nbr_heures>192){
            return cout+=(nbr_heures-192)*40;
        }else
            return cout;
    }
}