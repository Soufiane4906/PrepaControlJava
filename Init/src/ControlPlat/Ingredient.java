package ControlPlat;

public class Ingredient {
    String nom_aliment;
    String unite;
    String etat;
    int quantite;


    public Ingredient(String nom_aliment, String unite, String etat, int quantite) {
        this.nom_aliment = nom_aliment;
        this.unite = unite;
        this.etat = etat;
        this.quantite = quantite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ingredient that)) return false;

        if (quantite != that.quantite) return false;
        if (!nom_aliment.equals(that.nom_aliment)) return false;
        if (!unite.equals(that.unite)) return false;
        return etat.equals(that.etat);
    }


}
