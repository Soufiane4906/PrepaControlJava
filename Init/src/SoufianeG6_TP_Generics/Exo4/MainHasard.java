package SoufianeG6_TP_Generics.Exo4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainHasard {
    public static void main(String[] args) {
// Exemple  avec des entiers
        int a = 5;
        int b = 10;
        int resultatEntier =  Hasard.hasard(a, b);
        System.out.println(" Random Entier  : " + resultatEntier);
// Exempledes chaînes de caractères
        String s1 = "AAA";
        String s2 = "BBBB";
        String resultatString = Hasard.hasard(s1, s2);
        System.out.println("Random String: " + resultatString);

//EXemple avec player
Player P1=new Player("Messi"," Inter Miami",10);
Player P2=new Player("Ronaldo"," Hilal",7);

Player resultatPlayer = Hasard.hasard(P1, P2);
System.out.println("Random Player: " + resultatPlayer.toString());

//stream
/*        List<Integer> listeIntegeres = Arrays.asList(2,4,3);
        listeIntegeres.stream()
                .filter(s -> s%2==0)
                .collect(Collectors.toList());*/

    }

    public static class Player {
        private String Name;
        private String Team;
        private int NumeroTenu;
        public Player(String Name, String Team, int NumeroTenu) {
            this.Name = Name;
            this.Team = Team;
            this.NumeroTenu = NumeroTenu;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "Name='" + Name + '\'' +
                    ", Team='" + Team + '\'' +
                    ", NumeroTenu=" + NumeroTenu +
                    '}';
        }
    }




}
