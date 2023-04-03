package com.example.archery.commands;

import java.util.List;
import com.example.archery.entities.PlayerCirlcleHit;
import com.example.archery.services.ICirlcleHitService;

public class CircleHitCommand implements ICommand{
    
    private final ICirlcleHitService circleHitService;

    public CircleHitCommand(ICirlcleHitService circleHitService) {
        this.circleHitService = circleHitService;
    }

    @Override
    public void execute(List<String> tokens) {
        try {
        String playerName=tokens.get(1);
        String circleName=tokens.get(2);
        String roundName=tokens.get(3);

        PlayerCirlcleHit hit=circleHitService.create(playerName, circleName, roundName);
        System.out.println(hit.getPlayerName() +" "+ hit.getCircleName() + " "+ hit.getRoundName());
        //System.out.println(hit);

            
        } catch (Exception e) {           
            System.out.println(e.getMessage());
        }
       }

   
}
