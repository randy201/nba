package nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="DetailMatch")
public class DetailMatch {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int det_id;
    private Match  det_match;
    private Joueur det_joueur;
    private int det_temps;
    private Action det_action;
}
