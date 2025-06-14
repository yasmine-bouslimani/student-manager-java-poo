package service;

import model.Etudiant;

import java.util.List;

public class EtudiantService {
    public void afficherBulletin(Etudiant e) {
        System.out.println("Bulletin de " + e);
        e.getNotes().forEach(note -> System.out.println(" - " + note));
        System.out.printf("Moyenne générale : %.2f\n", e.calculerMoyenne());
    }

    public void afficherTous(List<Etudiant> etudiants) {
        for (Etudiant e : etudiants) {
            afficherBulletin(e);
            System.out.println("--------");
        }
    }
}
