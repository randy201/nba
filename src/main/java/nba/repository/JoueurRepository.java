package nba.repository;

import nba.model.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;

import nba.model.Joueur;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface JoueurRepository extends JpaRepository<Joueur,Integer> {
    @Query("SELECT j FROM Joueur j JOIN j.joueur_equipe e WHERE e = :equipe")
    List<Joueur> findByEquipe(@Param("equipe") Equipe equipe);
}
