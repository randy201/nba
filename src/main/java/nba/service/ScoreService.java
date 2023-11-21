package nba.service;

import nba.model.Score;
import nba.repository.ScoreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ScoreService {
    private final ScoreRepository scoreRepository;

    public ScoreService(ScoreRepository scoreRepository) {
        this.scoreRepository = scoreRepository;
    }

    public List<Score> getScore(){
        return scoreRepository.findAll();
    }
}
