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
        String teamName=tokens.get(1);
        String playerName=tokens.get(2);
        String circleName=tokens.get(3);
        String roundName=tokens.get(4);

        PlayerCirlcleHit hit=circleHitService.create(teamName, playerName, circleName, roundName);
        System.out.println(hit.getTeamName() +" "+hit.getPlayerName() +" "+ hit.getCircleName() + " "+ hit.getRoundName());
        //System.out.println(hit);

            
        } catch (Exception e) {           
            System.out.println(e.getMessage());
        }
       }

   
}
