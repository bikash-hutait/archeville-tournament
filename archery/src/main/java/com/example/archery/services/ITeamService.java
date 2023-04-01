package com.example.archery.services;

import com.example.archery.entities.Team;

public interface ITeamService {
    public Team create(String teamName, String player1, String player2);
}
