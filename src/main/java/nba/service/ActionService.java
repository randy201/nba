package nba.service;

import nba.model.Action;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nba.repository.ActionRepository;

import java.util.List;

@Service
public class ActionService {
    @Autowired
    private ActionRepository actRepo;
    public List<Action> getAction(){
        return actRepo.findAll();
    }

}
