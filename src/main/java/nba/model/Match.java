package nba.model;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="Match")
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int match_id;
    private Date match_date;
    @OneToOne
    private Equipe match_equipe1;
    @OneToOne
    private Equipe match_equipe2;
    public int match_score1;
    public int match_score2;
    public Match(){}

    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
        this.match_id = match_id;
    }

    public Date getMatch_date() {
        return match_date;
    }

    public void setMatch_date(Date match_date) {
        this.match_date = match_date;
    }

    public Equipe getMatch_equipe1() {
        return match_equipe1;
    }

    public void setMatch_equipe1(Equipe match_equipe1) {
        this.match_equipe1 = match_equipe1;
    }

    public Equipe getMatch_equipe2() {
        return match_equipe2;
    }

    public void setMatch_equipe2(Equipe match_equipe2) {
        this.match_equipe2 = match_equipe2;
    }

    public int getMatch_score1() {
        return match_score1;
    }

    public void setMatch_score1(int match_score1) {
        this.match_score1 = match_score1;
    }

    public int getMatch_score2() {
        return match_score2;
    }

    public void setMatch_score2(int match_score2) {
        this.match_score2 = match_score2;
    }
}
