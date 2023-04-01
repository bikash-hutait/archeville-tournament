package com.example.archery.services;

import com.example.archery.entities.PlayerCirlcleHit;
import com.example.archery.repositories.ICircleHitRepository;

public class CirlcleHitService implements ICirlcleHitService {
    private final ICircleHitRepository cirlceHitRepository;

    public CirlcleHitService(ICircleHitRepository cirlceHitRepository) {
        this.cirlceHitRepository = cirlceHitRepository;
    }

    @Override
    public PlayerCirlcleHit create(String playerName, String circleName, String roundName) {
        return cirlceHitRepository.save(new PlayerCirlcleHit(playerName, circleName, roundName));
    }
    
}
