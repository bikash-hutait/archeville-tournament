package com.example.archery.entities;

public class TeamScorecard extends BaseEntity {
   
    private final String teamName;
	private final int score;
    private final String roundName;
    
    public TeamScorecard(String id, String teamName, int score, String roundName) {
        this.id=id;
        this.teamName = teamName;
        this.score = score;
        this.roundName = roundName;
    }

    public TeamScorecard(String teamName, int score, String roundName) {
        this.teamName = teamName;
        this.score = score;
        this.roundName = roundName;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getScore() {
        return score;
    }

    public String getRoundName() {
        return roundName;
    }

    @Override
    public String toString() {
        return "TeamScorecard [teamName=" + teamName + ", score=" + score + ", roundName=" + roundName + "]";
    }



    
}
