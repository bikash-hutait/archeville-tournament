package com.example.archery.repositories;

import java.util.Optional;
import com.example.archery.entities.Team;

public interface ITeamRepository extends CRUDRepository<Team,String> {
    public Optional<Team> findByName(String name);  
}
