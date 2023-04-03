package com.example.archery.repositories;

import java.util.List;
import java.util.Optional;
import com.example.archery.entities.PlayerCirlcleHit;

public interface ICircleHitRepository extends CRUDRepository<PlayerCirlcleHit,String> {
    public Optional<PlayerCirlcleHit> findByName(String name);

    public List<String> findCircleByPlayerName(String playerName, String round);  
    public List<String> findAllPlayers(); 
    public List<String> getDataRoundWise(String roundName);
    public List<String> getDataRoundAndTeamWise(String teamName, String roundName);    
    public void findAllCirclesHits();
    public List<String> findCircleByPlayerNameAndRound(String playerName, String round);
    
}
