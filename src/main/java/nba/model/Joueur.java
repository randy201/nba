package nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Joueur")
public class Joueur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int joueur_id;

    private String joueur_nom;
    private Equipe joueur_equipe;

    public Joueur(){}

    public int getJoueur_id() {
        return joueur_id;
    }

    public void setJoueur_id(int joueur_id) {
        this.joueur_id = joueur_id;
    }

    public String getJoueur_nom() {
        return joueur_nom;
    }

    public void setJoueur_nom(String joueur_nom) {
        this.joueur_nom = joueur_nom;
    }

    public Equipe getJoueur_equipe() {
        return joueur_equipe;
    }

    public void setJoueur_equipe(Equipe joueur_equipe) {
        this.joueur_equipe = joueur_equipe;
    }
}
