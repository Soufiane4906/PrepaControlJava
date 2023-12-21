package ControlA1;

import java.util.Iterator;

public class Livre {
    private String titre;
    private String auteur;
    private int annePub;
    private boolean estemprunté;

    public String Theme ;

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getAnnePub() {
        return annePub;
    }

    public void setAnnePub(int annePub) {
        this.annePub = annePub;
    }

    public boolean isEstemprunté() {
        return estemprunté;
    }

    public void setEstemprunté(boolean estemprunté) {
        this.estemprunté = estemprunté;
    }

    public String getTheme() {
        return Theme;
    }

    public void setTheme(String theme) {
        Theme = theme;
    }

    public Livre(String titre, String auteur, int annePub, boolean estemprunté , String Theme) {
        this.titre = titre;
        this.auteur = auteur;
        this.annePub = annePub;
        this.estemprunté = estemprunté;
        this.Theme=Theme;
    }

    public void emprunter(){
        this.estemprunté=true;
    }
    public void retourner(){
        this.estemprunté=false;

    }



}
