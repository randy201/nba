package nba.service;

import jakarta.transaction.Transactional;
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

    @Transactional
    public void add_Detail_Match(DetailMatch detailMatch){
        detailMatchRepository.save(detailMatch);
    }

}
