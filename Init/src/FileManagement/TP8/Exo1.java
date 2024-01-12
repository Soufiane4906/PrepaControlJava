package FileManagement.TP8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Exo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le mot à rechercher : ");
        String motRecherche = scanner.next();

        System.out.print("Entrez le nom du fichier : ");
        String nomFichier = scanner.next();

        int occurrence = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(nomFichier))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] mots = ligne.split(" ");
                for (String mot : mots) {
                    if (mot.equals(motRecherche)) {
                        occurrence++;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Le mot '" + motRecherche + "' apparaît " + occurrence + " fois dans le fichier.");
    }
}
