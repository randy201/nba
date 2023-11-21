package nba.service;

import nba.model.Equipe;
import nba.model.Joueur;
import nba.repository.EquipeRepository;
import nba.repository.JoueurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JoueurService {
    @Autowired
    private JoueurRepository joueur_Repository;

    public List<Joueur> getJoueurByEquipe(Equipe equipe){
        return joueur_Repository.findByEquipe(equipe);
    }

    public List<Joueur> getAll(){
        return joueur_Repository.findAll();
    }
}
