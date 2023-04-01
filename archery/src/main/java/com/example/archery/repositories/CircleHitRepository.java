package com.example.archery.repositories;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import com.example.archery.entities.PlayerCirlcleHit;

public class CircleHitRepository implements ICircleHitRepository {
    private final Map<String,PlayerCirlcleHit> circleHitMap; 
    private Integer autoIncrement=0;   

    public CircleHitRepository(){
        circleHitMap = new HashMap<String,PlayerCirlcleHit>();
    }

    public CircleHitRepository(Map<String, PlayerCirlcleHit> circleHitMap) {
        this.circleHitMap = circleHitMap;       
    }

    @Override
    public PlayerCirlcleHit save(PlayerCirlcleHit entity) {

        if(entity.getId()==null){
            autoIncrement++;
            PlayerCirlcleHit circle = new PlayerCirlcleHit(Integer.toString(autoIncrement), entity.getPlayerName(),entity.getCircleName(), entity.getRoundName());
            circleHitMap.put(circle.getId(),circle);
            return circle;
        }

        circleHitMap.put(entity.getId(),entity);
        return entity;

    }

    @Override
    public List<PlayerCirlcleHit> findAll() {
        return circleHitMap.values().stream().collect(Collectors.toList());
    }
    
    @Override
    public List<String> findCircleByPlayerName(String playerName) {
        return circleHitMap.values().stream()
        .filter(t-> t.getPlayerName().equals(playerName))
        .map(c-> c.getCircleName())
        .collect(Collectors.toList());
          
    }

    @Override
    public List<String> findAllPlayers() {
      return circleHitMap.values().stream()           
            .map(c-> c.getPlayerName())
            .collect(Collectors.toList());    
    }


    @Override
    public Optional<PlayerCirlcleHit> findByName(String name) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void delete(PlayerCirlcleHit entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteById(String id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean existsById(String id) {
        // TODO Auto-generated method stub
        return false;
    }

  

    @Override
    public Optional<PlayerCirlcleHit> findById(String id) {
        // TODO Auto-generated method stub
        return null;
    }

  

    public Map<String, PlayerCirlcleHit> getCircleHitMap() {
        return circleHitMap;
    }

    @Override
    public String findAllCirclesHits() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString() {
        return "CircleHitRepository [autoIncrement=" + autoIncrement + ", circleHitMap="
                + circleHitMap + "]";
    }

    @Override
    public List<String> getDataRoundWise(String roundName) {
        return circleHitMap.values().stream()
        .filter(t-> t.getRoundName().equals(roundName))
        .map(c-> c.getCircleName())
        .collect(Collectors.toList());
    }

   

       

}
