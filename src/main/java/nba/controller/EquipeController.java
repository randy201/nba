package nba.controller;

import nba.model.Equipe;
import nba.service.ActionService;
import nba.service.EquipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/EquipeController")
@CrossOrigin(origins = "*")
public class EquipeController {
    private EquipeService equipe_Service;

    @Autowired
    public EquipeController(EquipeService equipe_service) {
        this.equipe_Service = equipe_service;
    }
    @GetMapping
    public List<Equipe> getAllEquipe(){
        return equipe_Service.gettAllEquipe();
    }
}
