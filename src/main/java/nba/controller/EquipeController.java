package nba.controller;

import nba.model.Equipe;
import nba.service.ActionService;
import nba.service.EquipeService;
import nba.service.JoueurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Equipe")
@CrossOrigin("*")
public class EquipeController {
    private EquipeService equipe_Service;
    private JoueurService joueur_service;

    @Autowired
    public EquipeController(EquipeService equipe_service) {
        this.equipe_Service = equipe_service;
    }
    @GetMapping
    public List<Equipe> getAllEquipe(){
        return equipe_Service.gettAllEquipe();
    }

    @PostMapping
    public Equipe insert(@RequestBody Equipe e){ return this.equipe_Service.insert(e); }
}
