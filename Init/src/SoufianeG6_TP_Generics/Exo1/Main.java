package SoufianeG6_TP_Generics.Exo1;

import java.util.ArrayList;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        ArrayList<Pair<Integer, String>> pairList = new ArrayList<>();
        pairList.add(new Pair<>(1, "A"));
        pairList.add(new Pair<>(2, "B"));
        pairList.add(new Pair<>(4, "D"));
        pairList.add(new Pair<>(3, "CC"));

        pairList.sort(Comparator.comparing(Pair::getKey));
        String message = "";
        for (Pair pp : pairList) {

            message += pp.toString();

        }

        System.out.println(message);
    }}
