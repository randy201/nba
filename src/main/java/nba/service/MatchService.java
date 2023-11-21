package nba.service;

import nba.model.Match;
import nba.model.Score;
import nba.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository ;

    public Match save(Match m){
        return matchRepository.save(m);
    }

}
