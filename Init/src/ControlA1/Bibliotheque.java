package ControlA1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Bibliotheque {
    private List<Livre> Livres =new ArrayList<>();

    private List<Membre> Membres=new ArrayList<>();

    public Bibliotheque(List<Livre> livres, List<Membre> membres) {
        Livres = livres;
        Membres = membres;
    }
    public Bibliotheque() {

    }

    public void AjouterLivre(Livre l){
        this.Livres.add(l);
    }

    public void InscrireMembre(Membre m){
        this.Membres.add(m);
    }
    public void EmprunterLivre(Membre m , Livre l){

        if (!this.Livres.contains(l)){
            m.emprunterLivre(l);
            this.Livres.add(l);
        }
        else throw new MemberException("Livre existe deja");

        if (!this.Membres.contains(m)){
            m.emprunterLivre(l);
            this.Membres.add(m);
        }
        else throw new RuntimeException("Membre existe deja");
    }
    public void retournerLivre(Membre m ,Livre l){
        if (this.Livres.contains(l)){
            m.retournerLivre(l);
            this.Livres.remove(l);
        }
        else throw new RuntimeException("Livre n'existe pas");

        if (this.Membres.contains(m)){
            m.retournerLivre(l);
            this.Membres.remove(m);
        }
        else throw new RuntimeException("Membre n'existe pas");

    }




public void hasTheme(String theme){
        Iterator<Livre> it=Livres.iterator();
        while(it.hasNext()){
           Livre ll=it.next();
           if(ll.getTheme()==theme){
               System.out.println("HELLO YAAAH");
           }
           else{
               System.out.println("Not found Fuck You");
           }
        }

}
}
