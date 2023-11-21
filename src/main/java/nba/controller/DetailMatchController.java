package nba.controller;

import nba.model.DetailMatch;
import nba.service.DetailMatchService;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/detailMatchs")
@CrossOrigin("*")
public class DetailMatchController {
    private final DetailMatchService detailMatchService;

    public DetailMatchController(DetailMatchService detailMatchService) {
        this.detailMatchService = detailMatchService;
    }

    @PostMapping
    public HashMap<String, String> getDetailAction(@RequestBody DetailMatch detailMatch){
        HashMap<String,String> reponse = new HashMap<>();
        try {
            detailMatchService.add_Detail_Match(detailMatch);
            reponse.put("Message","Success . ");
        }catch (Exception e){
            reponse.put("Message","Error: " + e.getMessage());
        }
        return reponse;
    }
}
