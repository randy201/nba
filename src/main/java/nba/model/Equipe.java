package nba.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="Equipe")
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int equipe_id;
    private String equipe_nom;

    public Equipe(){}

    public int getEquipe_id() {
        return equipe_id;
    }

    public void setEquipe_id(int equipe_id) {
        this.equipe_id = equipe_id;
    }

    public String getEquipe_nom() {
        return equipe_nom;
    }

    public void setEquipe_nom(String equipe_nom) {
        this.equipe_nom = equipe_nom;
    }
}
