package model;

public class Note {
    private String matiere;
    private double valeur;

    public Note(String matiere, double valeur) {
        this.matiere = matiere;
        this.valeur = valeur;
    }

    public double getValeur() {
        return valeur;
    }

    public String getMatiere() {
        return matiere;
    }

    @Override
    public String toString() {
        return matiere + " : " + valeur;
    }
}
