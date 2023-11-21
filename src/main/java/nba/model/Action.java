package nba.model;


import jakarta.persistence.*;
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

    public Action(){}

    public Action(int action_id,String action_nom,int action_point) {
        setAction_id(action_id);
        setAction_nom(action_nom);
        setAction_point(action_point);
    }

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }

    public String getAction_nom() {
        return action_nom;
    }

    public void setAction_nom(String action_nom) {
        this.action_nom = action_nom;
    }

    public int getAction_point() {
        return action_point;
    }

    public void setAction_point(int action_point) {
        this.action_point = action_point;
    }
}
