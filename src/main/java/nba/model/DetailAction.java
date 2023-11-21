package nba.model;

import java.util.ArrayList;
import java.util.List;

public class DetailAction {
    Match match_id;
    int match_temps;
    Joueur sender;
    Action action;
    Joueur receiver;


    public Match getMatch_id() {
        return match_id;
    }

    public void setMatch_id(Match match_id) {
        this.match_id = match_id;
    }

    public int getMatch_temps() {
        return match_temps;
    }

    public void setMatch_temps(int match_temps) {
        this.match_temps = match_temps;
    }

    public Joueur getSender() {
        return sender;
    }

    public void setSender(Joueur sender) {
        this.sender = sender;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public Joueur getReceiver() {
        return receiver;
    }

    public void setReceiver(Joueur receiver) {
        this.receiver = receiver;
    }

    public List<DetailMatch> get_All_Detail_By_Action(){
        List<DetailMatch> detailMatches = new ArrayList<>();
        if(getAction().getAction_nom().equals("Passe")){
            DetailMatch passe = new DetailMatch(getMatch_id(),getSender(),getMatch_temps(),getAction());
            detailMatches.add(passe);
            if (getSender().getJoueur_equipe().getEquipe_id() != getReceiver().getJoueur_equipe().getEquipe_id()){
                Action interception = new Action(6,"Interception",0);
                DetailMatch interceptionReceiver = new DetailMatch(getMatch_id(),getReceiver(),getMatch_temps(),interception);
                detailMatches.add(interceptionReceiver);
            }
        } else if (getAction().getAction_nom().equals("Tir 0")) {
            DetailMatch tir0 = new DetailMatch(getMatch_id(),getSender(),getMatch_temps(),getAction());
            detailMatches.add(tir0);
            if (getSender().getJoueur_equipe().getEquipe_id() == getReceiver().getJoueur_equipe().getEquipe_id()){
                Action rebondO = new Action(7,"Rebond O",0);
                DetailMatch rebondOReceiver = new DetailMatch(getMatch_id(),getReceiver(),getMatch_temps(),rebondO);
                detailMatches.add(rebondOReceiver);
            }else {
                Action rebondD = new Action(8,"Rebond D",0);
                DetailMatch rebondDReceiver = new DetailMatch(getMatch_id(),getReceiver(),getMatch_temps(),rebondD);
                detailMatches.add(rebondDReceiver);
            }
        } else {
            DetailMatch tirMaty = new DetailMatch(getMatch_id(),getSender(),getMatch_temps(),getAction());
            detailMatches.add(tirMaty);
        }
        return detailMatches;
    }
}
