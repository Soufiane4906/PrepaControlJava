package ControlPlat;

public class  IngredientACuire extends Ingredient {

int temperature;
    public IngredientACuire(String nom_aliment, String unite, String etat, int quantite, int temp) {
        super(nom_aliment, unite, etat, quantite);
        this.temperature = temp;
    }
public void cuire(){
        super.etat = "cuit";
        temperature = 200;
}

}
