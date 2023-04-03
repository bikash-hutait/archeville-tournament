package com.example.archery.appConfig;

import com.example.archery.commands.CircleHitCommand;
import com.example.archery.commands.CommandInvoker;
import com.example.archery.commands.CreateTeamCommand;
import com.example.archery.repositories.CircleHitRepository;
import com.example.archery.repositories.ICircleHitRepository;
import com.example.archery.repositories.ITeamRepository;
import com.example.archery.repositories.TeamRepository;
import com.example.archery.services.CirlcleHitService;
import com.example.archery.services.ICirlcleHitService;
import com.example.archery.services.ITeamService;
import com.example.archery.services.TeamService;

public class ApplicationConfig {
   
    private final ITeamRepository teamRepository = new TeamRepository();    
    private final ITeamService teamService = new TeamService(teamRepository);  

    private final ICircleHitRepository circleHitRepository = new CircleHitRepository();    
    private final ICirlcleHitService cirlcleHitService = new CirlcleHitService(circleHitRepository);  


    private final CreateTeamCommand createTeamCommand = new CreateTeamCommand(teamService);
    private final CircleHitCommand circleHitCommand = new CircleHitCommand(cirlcleHitService);


    private final CommandInvoker commandInvoker = new CommandInvoker();
    public CommandInvoker getCommandInvoker(){
        commandInvoker.register("CREATE-TEAM",createTeamCommand);
        commandInvoker.register("CIRCLE-HIT",circleHitCommand);
             
        return commandInvoker;
    }
}