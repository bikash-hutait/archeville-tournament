package com.example.archery.commands;

import java.util.List;

import com.example.archery.entities.Team;
import com.example.archery.services.ITeamService;

public class CreateTeamCommand  implements ICommand{
    private final ITeamService teamService;

    public CreateTeamCommand(ITeamService teamService) {
        this.teamService = teamService;
    }


 // Sample Input Token List:- ["CREATE-TEAM","Gyrhuna","János Diák", "Süsü"]
   
    @Override
    public void execute(List<String> tokens) {
        try {
        String teamName=tokens.get(1);
        String player1=tokens.get(2);
        String player2=tokens.get(3);

        Team team=teamService.create(teamName, player1,player2);
        System.out.println(team.getTeamName() +" "+ team.getPlayer1() + " "+ team.getPlayer2());
        //System.out.println(team);

            
        } catch (Exception e) {           
            System.out.println(e.getMessage());
        }
       }

   
}
