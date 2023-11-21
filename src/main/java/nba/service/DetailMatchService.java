package nba.service;

import nba.repository.DetailMatchRepository;
import org.springframework.stereotype.Service;

@Service
public class DetailMatchService {
    private final DetailMatchRepository detailMatchRepository;

    public DetailMatchService(DetailMatchRepository detailMatchRepository) {
        this.detailMatchRepository = detailMatchRepository;
    }
}
