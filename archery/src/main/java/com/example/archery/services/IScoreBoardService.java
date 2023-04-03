package com.example.archery.services;

public interface IScoreBoardService {
    public void tournamentScoreBoard();   
    public void getIndivisualPlayerScoreRoundWise(String roundNumber);
    public boolean hasBonusPoints(String teamName, String roundNum);
                
    
}



