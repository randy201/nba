package nba.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nba.repository.ActionRepository;

@Service
public class ActionService {
    private final ActionRepository actionRepository;
    @Autowired
    public ActionService(ActionRepository aR){
         actionRepository = aR;
    }

}
