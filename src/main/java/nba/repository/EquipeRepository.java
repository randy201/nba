package nba.repository;

import nba.model.Joueur;
import org.springframework.data.jpa.repository.JpaRepository;

import nba.model.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe,Integer>{
}
