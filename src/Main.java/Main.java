package main;

import model.Etudiant;
import model.Note;
import service.EtudiantService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Etudiant> etudiants = new ArrayList<>();
        EtudiantService service = new EtudiantService();

        Etudiant yasmine = new Etudiant("Bouslimani", "Yasmine", "2025MI001");
        yasmine.ajouterNote(new Note("Java", 18.5));
        yasmine.ajouterNote(new Note("Mathématiques", 15.0));

        etudiants.add(yasmine);

        service.afficherTous(etudiants);
    }
}
