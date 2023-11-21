package nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Action")
public class Action {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int action_id;
    private String action_nom;
    private int action_point;
}
