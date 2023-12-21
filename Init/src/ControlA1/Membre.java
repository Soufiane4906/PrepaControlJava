package ControlA1;

import java.util.ArrayList;
import java.util.List;

public class Membre {

    private String nom;
    private String adresse;
    private List<Livre> Livreempr=new ArrayList<>() ;
    private List<String> Themes=new ArrayList<>() ;

    public void addThemes (String theme){
        this.Themes.add(theme);
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Livre> getLivreempr() {
        return Livreempr;
    }

    public void setLivreempr(List<Livre> livreempr) {
        Livreempr = livreempr;
    }

    public Membre(String nom, String adresse, List<Livre> livreempr) {
        this.nom = nom;
        this.adresse = adresse;
        Livreempr = livreempr;
    }

    public Membre(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    public void emprunterLivre(Livre i){
        this.Livreempr.add(i);
        i.emprunter();

    }

    public void retournerLivre(Livre i){
        this.Livreempr.remove(i);
        i.retourner();

    }
}
