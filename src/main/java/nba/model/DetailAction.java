package nba.model;

public class DetailAction {
    int match_id;
    int match_temps;
    Joueur sender;
    Action action;
    Joueur receiver;



    public int getMatch_id() {
        return match_id;
    }

    public void setMatch_id(int match_id) {
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
}
