package nba.model;

import jakarta.persistence.*;

@Entity
@Table(name="DetailMatch")
public class DetailMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int det_id;
    @OneToOne
    private Match  det_match;
    @OneToOne
    private Joueur det_joueur;
    private int det_temps;
    @OneToOne
    private Action det_action;
    public DetailMatch(){}

    public int getDet_id() {
        return det_id;
    }

    public void setDet_id(int det_id) {
        this.det_id = det_id;
    }

    public Match getDet_match() {
        return det_match;
    }

    public void setDet_match(Match det_match) {
        this.det_match = det_match;
    }

    public Joueur getDet_joueur() {
        return det_joueur;
    }

    public void setDet_joueur(Joueur det_joueur) {
        this.det_joueur = det_joueur;
    }

    public int getDet_temps() {
        return det_temps;
    }

    public void setDet_temps(int det_temps) {
        this.det_temps = det_temps;
    }

    public Action getDet_action() {
        return det_action;
    }

    public void setDet_action(Action det_action) {
        this.det_action = det_action;
    }
}
