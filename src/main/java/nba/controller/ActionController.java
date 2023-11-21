package nba.controller;

import nba.model.Action;
import nba.service.ActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/actions")
@CrossOrigin("*")
public class ActionController {
    private ActionService actionService;

    @Autowired
    public ActionController(ActionService actionService) {
        this.actionService = actionService;
    }

    @GetMapping
    public List<Action> getAction(){
        return  actionService.getAction();
    }

    @PostMapping
    public HashMap<String, String> insertAction(@RequestBody Action action){
        HashMap<String,String> reponse = new HashMap<>();
        try {
            actionService.create(action);
            reponse.put("Message","Inserer avec success . ");
        }catch (Exception e){
            reponse.put("Message","Error: " + e.getMessage());
        }
        return reponse;
    }


}
