package CostCenter;

public class Formateur_Externe extends Formateur {
    String centre;
    public Formateur_Externe() {
    }
    public Formateur_Externe(String nom, String prenom, String centre) {
        super(nom, prenom);
        this.centre = centre;
    }
    public Formateur_Externe(String nom, String prenom, int nbr_heures, String
            centre) {
        super(nom, prenom, nbr_heures);

        this.centre = centre;
    }
    @Override
    public double cout() {
        return nbr_heures*40;
    }
}