package StreamAPI;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Exo3 {

    public static void main(String[] args) {
        // Créer une liste d'employés
        List<Employe> employes = new ArrayList<>();
        employes.add(new Employe("Jean", 60000, "Informatique"));
        employes.add(new Employe("Pierre", 70000, "Marketing"));
        employes.add(new Employe("Marie", 80000, "Finance"));
        employes.add(new Employe("Paul", 40000, "Production"));
        employes.add(new Employe("Jasmine", 90000, "Devops"));

        // Filtrer la liste pour inclure uniquement les employés dont le salaire est supérieur à 50000
        List<Employe> employesFiltres = employes.stream()
                .filter(employe -> employe.getSalaire() > 50000)
                .collect(Collectors.toList());

        // Trier la liste filtrée par ordre décroissant de salaire
        employesFiltres.sort(Comparator.comparingDouble(Employe::getSalaire).reversed());

        // Afficher les trois premiers employés de la liste triée
        employesFiltres.stream()
                .limit(3)
                .forEach(System.out::println);
    }}

     class Employe {

        private String nom;
        private double salaire;
        private String service;

        public Employe(String nom, double salaire, String service) {
            this.nom = nom;
            this.salaire = salaire;
            this.service = service;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public double getSalaire() {
            return salaire;
        }

        public void setSalaire(double salaire) {
            this.salaire = salaire;
        }

        public String getService() {
            return service;
        }

        public void setService(String service) {
            this.service = service;
        }

         @Override
         public String toString() {
             return "Employe{" +
                     "nom='" + nom + '\'' +
                     ", salaire=" + salaire +
                     ", service='" + service + '\'' +
                     '}';
         }
     }


