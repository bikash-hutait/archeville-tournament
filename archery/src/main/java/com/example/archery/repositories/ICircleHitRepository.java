package com.example.archery.repositories;

import java.util.List;
import java.util.Optional;
import com.example.archery.entities.PlayerCirlcleHit;

public interface ICircleHitRepository extends CRUDRepository<PlayerCirlcleHit,String> {
    public Optional<PlayerCirlcleHit> findByName(String name);

    public List<String> findCircleByPlayerName(String playerName);  
    public List<String> findAllPlayers(); 
    public List<String> getDataRoundWise(String roundName);  
    public String findAllCirclesHits();
    
}
