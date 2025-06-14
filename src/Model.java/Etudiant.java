package model;

import java.util.ArrayList;
import java.util.List;

public class Etudiant {
    private String nom;
    private String prenom;
    private String matricule;
    private List<Note> notes;

    public Etudiant(String nom, String prenom, String matricule) {
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
        this.notes = new ArrayList<>();
    }

    public void ajouterNote(Note note) {
        notes.add(note);
    }

    public List<Note> getNotes() {
        return notes;
    }

    public double calculerMoyenne() {
        if (notes.isEmpty()) return 0;
        double somme = 0;
        for (Note note : notes) {
            somme += note.getValeur();
        }
        return somme / notes.size();
    }

    @Override
    public String toString() {
        return prenom + " " + nom + " (" + matricule + ")";
    }
}
