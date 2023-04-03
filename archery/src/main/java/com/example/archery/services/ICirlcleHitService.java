package com.example.archery.services;

import com.example.archery.entities.PlayerCirlcleHit;

public interface ICirlcleHitService {
    public PlayerCirlcleHit create(String teamName, String playerName, String circleName, String roundName);
}
