package nba.controller;

import nba.model.Equipe;
import nba.model.Match;
import nba.service.JoueurService;
import nba.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

}
