package nba.repository;

import nba.model.Equipe;
import nba.model.Joueur;
import nba.model.Match;
import nba.model.Score;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MatchRepository extends JpaRepository<Match,Integer>{
    @Query("SELECT m FROM Match m JOIN m.match_equipe1 e WHERE e = :equipe")
    List<Match> findByMatchEquipe1(@Param("equipe") Equipe equipe);

    @Query("SELECT m FROM Match m JOIN m.match_equipe2 e WHERE e = :equipe")
    List<Match> findByMatchEquipe2(@Param("equipe") Equipe equipe);

}
