package nba.service;

import nba.model.Equipe;
import nba.model.Joueur;
import nba.model.Match;
import nba.model.Score;
import nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


import java.util.List;
@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository ;

    public Match save(Match m){
        return matchRepository.save(m);
    }

    public List<Match> getAllMatch(){
        return matchRepository.findAll();
    }

    public List<Match> getAllMatchByEquipe(Equipe e){
        List<Match> all = new ArrayList<>() ;
        List<Match> m1 = matchRepository.findByMatchEquipe1(e);
        List<Match> m2 = matchRepository.findByMatchEquipe2(e);
        for (Match m: m1) {
            all.add(m);
        }
        for (Match m: m2) {
            all.add(m);
        }
        return all;
    }

    public List<Match> getAllMatchJoueur(Joueur j){
        return null;
    }
}
