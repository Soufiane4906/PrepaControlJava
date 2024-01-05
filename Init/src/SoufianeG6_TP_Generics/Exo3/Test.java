package SoufianeG6_TP_Generics.Exo3;

import java.util.Arrays;

public class Test<T> {
    T x;
    T[] t1;
    T[] t2;
    public T inf;
    public int compte;

    public void f() {


        x = null;  // On ne peut pas instancier un objet de type générique directement
        t2 = Arrays.copyOf(t1, t1.length);

        t2 = (T[]) new Object[5];
    }
}

