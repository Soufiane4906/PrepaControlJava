package SoufianeG6_TP_Generics.Exo4;

import java.util.Random;

public class Hasard {


    public static <T> T hasard(T x, T y) {
        Random random = new Random();
        boolean choice = random.nextBoolean();
        return choice ? x : y;

    }
}