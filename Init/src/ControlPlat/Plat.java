package ControlPlat;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Plat {
    public String getNom() {
        return nom;
    }

    String nom ;

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    ArrayList<Ingredient> ingredients;
    public Plat(String nom) {
        this.nom = nom;
        ingredients = new ArrayList<Ingredient>();

    }
    public void add_ingredient (Ingredient i ){
        ingredients.add(i);
    }
    public Plat(String nom ,ArrayList<Ingredient> e ) {
        this.nom = nom;
        ingredients = new ArrayList<Ingredient>(e);

    }

/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plat plat)) return false;

        if (!getNom().equals(plat.getNom())) return false;
        return getIngredients().equals(plat.getIngredients());
    }
*/

    public static void main(String[] args) {
        Plat plat1 = new Plat("Choucroute");
        plat1.add_ingredient(new Ingredient("Choucroute", "g","cuite", 500));
        Ingredient in2= new Ingredient("lard","g","cuit",150);
        Ingredient in3= new Ingredient("soucisses","entier","cuit",2);
        plat1.add_ingredient(in2);
        plat1.add_ingredient(in3);
        Plat plat2 = new Plat("Choucroute");
        plat2.add_ingredient(new Ingredient("Choucroute", "g","cuite", 500));
        Ingredient in12= new Ingredient("lard","g","cuit",150);
        Ingredient in13= new Ingredient("soucisses","entier","cuit",2);
        plat2.add_ingredient(in12);
        plat2.add_ingredient(in13);
        if(plat1.equals(plat2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }


}
