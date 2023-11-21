package nba.controller;

import nba.model.Score;
import nba.service.ScoreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/scores")
@CrossOrigin("*")
public class ScoreController {
    private final ScoreService scoreService;

    public ScoreController(ScoreService scoreService) {
        this.scoreService = scoreService;
    }

    @GetMapping
    public List<Score> getAllScore(){
        return scoreService.getScore();
    }
}
