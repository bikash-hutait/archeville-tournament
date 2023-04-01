package com.example.archery.appConfig;

import com.example.archery.commands.CommandInvoker;
import com.example.archery.commands.CreateTeamCommand;
import com.example.archery.repositories.ITeamRepository;
import com.example.archery.repositories.TeamRepository;
import com.example.archery.services.ITeamService;
import com.example.archery.services.TeamService;

public class ApplicationConfig {
   
    private final ITeamRepository teamRepository = new TeamRepository();
    
    private final ITeamService teamService = new TeamService(teamRepository);
    

    private final CreateTeamCommand createTeamCommand = new CreateTeamCommand(teamService);
  
    private final CommandInvoker commandInvoker = new CommandInvoker();

    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE-TEAM",createTeamCommand);
        //commandInvoker.register("PLAYER_CIRCLE_ROUNDWISE",playerCircleRoundCommand);
        //commandInvoker.register("SHOW_TEAM_SCORE",showTeamScoreCommand);      
        return commandInvoker;
    }
}