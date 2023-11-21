package nba.service;

import nba.model.DetailAction;
import nba.model.DetailMatch;
import nba.repository.DetailMatchRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailMatchService {
    private final DetailMatchRepository detailMatchRepository;

    public DetailMatchService(DetailMatchRepository detailMatchRepository) {
        this.detailMatchRepository = detailMatchRepository;
    }

    public List<DetailMatch> add_Detail(DetailAction detailAction){
        return detailAction.get_All_Detail_By_Action();
    }

}
