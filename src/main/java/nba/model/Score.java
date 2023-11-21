package nba.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import org.hibernate.annotations.Immutable;

import java.util.Date;

@Entity
@IdClass(Score.class)
@Immutable
public class Score {
    @Id
    int match_id;
    @Id
    int score;
    String equipe_nom;
    Date match_date;

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getEquipe_nom() {
        return equipe_nom;
    }

    public void setEquipe_nom(String equipe_nom) {
        this.equipe_nom = equipe_nom;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }
}
