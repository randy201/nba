package nba.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.qos.logback.core.joran.action.Action;

public interface ActionRepository extends JpaRepository<Action,Integer>{
    
}
