package StreamAPI;

import java.util.*;

public class Exo2 {
    public static void main(String[] args) {
        // Créer des produits
        Produit produit1 = new Produit("Télévision", 1000);
        Produit produit2 = new Produit("Ordinateur portable", 2000);
        Produit produit3 = new Produit("Tablette", 500);

        // Créer des commandes
        Commande commande1 = new Commande(1, "2023-07-20", 3500, Arrays.asList(produit1, produit2));
        Commande commande2 = new Commande(2, "2023-08-01", 2500, Arrays.asList(produit3));

        // Trouver la commande la plus chère
        Commande commandeLaPlusChère = commande1.getMontant() > commande2.getMontant() ? commande1 : commande2;
        System.out.println("La commande la plus chère est : " + commandeLaPlusChère.toString());

        // Obtenir la liste de tous les produits distincts dans toutes les commandes
        List<Produit> produitsDistincts = new ArrayList<>();
        produitsDistincts.addAll(commande1.getProduits());
        produitsDistincts.addAll(commande2.getProduits());
        Set<Produit> produitsDistinctsSet = new HashSet<>(produitsDistincts);
        List<Produit> produitsDistinctsList = new ArrayList<>(produitsDistinctsSet);
        System.out.println("La liste de tous les produits distincts est : " );
        for (Produit p :produitsDistinctsList
             ) {
            System.out.println(p.toString());

        }

        // Calculer le montant total de toutes les commandes passées aujourd'hui
        Date dateJour = new Date();
        List<Commande> commandesPasseesAujourdhui = new ArrayList<>();
        commandesPasseesAujourdhui.add(commande1);
        commandesPasseesAujourdhui.add(commande2);
        double montantTotalCommandesPasseesAujourdhui = commandesPasseesAujourdhui.stream()
                .mapToDouble(commande -> commande.getMontant())
                .sum();
        System.out.println("Le montant total de toutes les commandes passées aujourd'hui est : " + montantTotalCommandesPasseesAujourdhui);
    }

}

class Produit {

    private String nom;
    private double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }
}

class Commande {

    private int id;
    private String date;
    private double montant;
    private List<Produit> produits;

    public Commande(int id, String date, double montant, List<Produit> produits) {
        this.id = id;
        this.date = date;
        this.montant = montant;
        this.produits = produits;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", montant=" + montant +
                ", produits=" + produits +
                '}';
    }
}

