package nba.controller;

import nba.model.Equipe;
import nba.model.Match;
import nba.model.Score;
import nba.service.JoueurService;
import nba.service.MatchService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Match")
@CrossOrigin(origins = "*")
public class MatchController {
    private MatchService match_Servicer;

    @Autowired
    public MatchController(MatchService matchService) {
        this.match_Servicer = matchService;
    }

    @PostMapping
    public Match ajoutMatch(@RequestBody Match match){
        return match_Servicer.save(match);
    }

    @GetMapping
    public List<Match> getAllMatch(){
        return match_Servicer.getAllMatch();
    }

    @GetMapping("/{equipe}")
    public List<Match> getAllMatchByEquipe(@PathVariable("equipe") int equipe){
        Equipe e = new Equipe();
        e.setEquipe_id(equipe);
        return match_Servicer.getAllMatchByEquipe(e);
    }

}
