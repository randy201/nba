package nba.service;

import nba.model.Equipe;
import nba.repository.ActionRepository;
import nba.repository.EquipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipeService {
    @Autowired
    private EquipeRepository equipe_Repository;

    public List<Equipe> gettAllEquipe(){
        return equipe_Repository.findAll();
    }
}
