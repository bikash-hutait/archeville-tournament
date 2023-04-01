package com.example.archery.services;

import com.example.archery.entities.Team;
import com.example.archery.repositories.ITeamRepository;

public class TeamService implements ITeamService {
  
    private final ITeamRepository teamRepository;
    
    public TeamService(ITeamRepository teamRepository) {
        this.teamRepository = teamRepository;       
    }

    @Override
    public Team create(String teamName, String player1, String player2) {
        return teamRepository.save(new Team(teamName, player1, player2));
    }

}
