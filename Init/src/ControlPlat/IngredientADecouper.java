package ControlPlat;

public class IngredientADecouper  extends Ingredient {

    public IngredientADecouper(String nom_aliment, String unite, String etat, int quantite) {
        super(nom_aliment, unite, etat, quantite);
    }
    public void decouper (){
        super.etat = "découpé";
    }
}
