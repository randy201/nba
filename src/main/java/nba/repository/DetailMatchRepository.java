package nba.repository;

import nba.model.DetailMatch;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailMatchRepository extends JpaRepository<DetailMatch,Integer> {
    
}
