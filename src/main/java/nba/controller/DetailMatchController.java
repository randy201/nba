package nba.controller;

import nba.model.DetailAction;
import nba.model.DetailMatch;
import nba.service.DetailMatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/detailMatchs")
@CrossOrigin("*")
public class DetailMatchController {
    private final DetailMatchService detailMatchService;

    public DetailMatchController(DetailMatchService detailMatchService) {
        this.detailMatchService = detailMatchService;
    }

    @PostMapping
    public List<DetailMatch> getDetailAction(@RequestBody DetailAction detailAction){
        return detailMatchService.add_Detail(detailAction);
    }
}
