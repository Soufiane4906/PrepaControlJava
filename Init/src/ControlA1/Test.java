package ControlA1;

public class Test {

    public static void main(String[] args) {
        Membre m1 = new Membre("Amine","La cité");
        Membre m2 = new Membre("Youssef","La cité");

        Livre l1=new Livre("Le secret","John Martin",2010,false ,"haha");
        Livre l2=new Livre("LAST OF US","FARID EL ATRACH",1990,false , "haha");
        Livre l3=new Livre("GOT","JACK BERNARD",2020,true , "haha");

        Bibliotheque B=new Bibliotheque();

        B.AjouterLivre(l1);
        B.AjouterLivre(l2);
        B.InscrireMembre(m1);
        B.InscrireMembre(m2);

        B.EmprunterLivre(m1,l1);
        B.EmprunterLivre(m1,l1);

    }
}
