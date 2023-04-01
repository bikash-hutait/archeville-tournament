package com.example.archery.entities;

public class PlayerScorecard extends BaseEntity {
   
    private final String playerName;
	private final int score;
    private final String roundName;

    public PlayerScorecard(String id, String playerName, int score, String roundName) {
        this.id=id;
        this.playerName = playerName;
        this.score = score;
        this.roundName = roundName;
    }

    public PlayerScorecard(String playerName, int score, String roundName) {
        this.playerName = playerName;
        this.score = score;
        this.roundName = roundName;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getScore() {
        return score;
    }

    public String getRoundName() {
        return roundName;
    }

    @Override
    public String toString() {
        return "PlayerScorecard [playerName=" + playerName + ", score=" + score + ", roundName=" + roundName + "]";
    }

    
}
