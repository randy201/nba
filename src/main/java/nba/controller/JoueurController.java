package nba.controller;

import nba.model.Equipe;
import nba.model.Joueur;
import nba.service.EquipeService;
import nba.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Joueur")
@CrossOrigin("*")
public class JoueurController {
    private JoueurService joueur_Servicer;

    @Autowired
    public JoueurController(JoueurService Joueur_servicer) {
        this.joueur_Servicer = Joueur_servicer;
    }

    @GetMapping
    public List<Joueur> getAllEquipe(@RequestBody Equipe e){
        return joueur_Servicer.getJoueurByEquipe(e);
    }
}
