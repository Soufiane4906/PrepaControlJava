package FileManagement.TP8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exo2 {
    public static void main(String[] args) {
        System.out.print("Entrez le nom du fichier : ");

        String file = new Scanner(System.in).next();

        Map<String, Integer> occurrences = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String ligne;
            while ((ligne = reader.readLine()) != null) {
                String[] mots = ligne.split("\\s+");
                for (String mot : mots) {
                    occurrences.put(mot, occurrences.getOrDefault(mot, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Occurrences de chaque mot dans le fichier : ");
        for (Map.Entry<String, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " fois");
        }
    }
}
