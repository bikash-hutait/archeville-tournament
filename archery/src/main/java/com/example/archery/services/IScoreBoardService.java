package com.example.archery.services;


public interface IScoreBoardService {
    public void tournamentScoreBoard();
    public void getTeamScoreRoundWise(String teamName, String roundNum);
    public void getIndivisualPlayerScoreRoundWise(String roundNumber);
    public void getBonusPointsRoundWise(String teamName, String roundNum);
}



