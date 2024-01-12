package StreamAPI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
/*
*
Pour effectuer les tâches spécifiées, nous pouvons utiliser les méthodes suivantes de la classe Collection :

stream() : Cette méthode renvoie un flux d'éléments de la collection.
filter() : Cette méthode filtre le flux en fonction d'une condition.
map() : Cette méthode applique une fonction à chaque élément du flux.
*
*
* */
public class Exo1 {

    public static void main(String[] args) {
        // Créer une collection de personnes
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Jean", "Dupont", 35));
        personnes.add(new Personne("Pierre", "Martin", 25));
        personnes.add(new Personne("Marie", "Caron", 38));

        // Filtrer les personnes ayant plus de 30 ans
        Collection<Personne> personnesAgees = personnes.stream()
                .filter(personne -> personne.getAge() > 30)
                .collect(Collectors.toList());

        // Mapper les noms des personnes filtrées dans une nouvelle liste
        List<String> noms = personnesAgees.stream()
                .map(personne -> personne.getNom())
                .collect(Collectors.toList());

        // Afficher la liste résultante
        System.out.println(noms);
    }
}

class Personne {

    private String nom;
    private String prenom;
    private int age;

    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

