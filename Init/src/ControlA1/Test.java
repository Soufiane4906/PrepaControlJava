package ControlA1;

import java.util.Random;

public class Test {

    public static <T> T hasard(T x, T y) {
        Random random = new Random();
        boolean choix = random.nextBoolean();

        // Choix aléatoire entre x et y
        return choix ? x : y;
    }



    public static class Student {
        private String firstName;
        private String lastName;
        private int studentId;

        public Student(String firstName, String lastName, int studentId) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.studentId = studentId;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", studentId=" + studentId +
                    '}';
        }
    }


    public static void main(String[] args) {
        // Exemple d'utilisation avec des entiers
        int a = 5;
        int b = 10;
        int resultatEntier = hasard(a, b);
        System.out.println("Entier choisi au hasard : " + resultatEntier);

        // Exemple d'utilisation avec des chaînes de caractères
        String s1 = "Hello";
        String s2 = "World";
        String resultatString = hasard(s1, s2);
        System.out.println("Chaîne de caractères choisie au hasard : " + resultatString);



        // Exemple d'utilisation avec des objets Student
        Student student1 = new Student("souso", "gogo", 12345);
        Student student2 = new Student("John", "Snow", 67890);

        Student resultatStudent = hasard(student1, student2);
        System.out.println("Étudiant choisi au hasard : " + resultatStudent);
    }
}

