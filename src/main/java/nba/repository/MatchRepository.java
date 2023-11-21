package nba.repository;

import nba.model.Match;
import org.springframework.data.jpa.repository.JpaRepository;
public interface MatchRepository extends JpaRepository<Match,Integer>{
    
}
