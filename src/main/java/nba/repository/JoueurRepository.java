package nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nba.model.Joueur;

public interface JoueurRepository extends JpaRepository<Joueur,Integer> {
    
}
