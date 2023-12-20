package TPDIAGRAMMEDECLASSE;

public class Main {

    public static void main(String[] args) {
        Qcm q = new Qcm("Java is oop language?");
        Reponse r2 = new Reponse("Vrai", true);
        q.addReponse("false", false);
        q.addReponse(r2);
// Vous pouvez tester les autres méthodes :D
    }
}
