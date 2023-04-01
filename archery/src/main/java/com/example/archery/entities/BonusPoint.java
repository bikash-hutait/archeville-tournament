package com.example.archery.entities;

public class BonusPoint extends BaseEntity {
    private final String teamName;
	private final int point;
    private final String roundName;
    
    public BonusPoint(String id, String teamName, int point, String roundName) {
        this.id=id;
        this.teamName = teamName;
        this.point = point;
        this.roundName = roundName;
    }

    public BonusPoint(String teamName, int point, String roundName) {       
        this.teamName = teamName;
        this.point = point;
        this.roundName = roundName;
    }


    public String getTeamName() {
        return teamName;
    }

    public int getPoint() {
        return point;
    }

    public String getRoundName() {
        return roundName;
    }

    @Override
    public String toString() {
        return "BonusPoint [teamName=" + teamName + ", point=" + point + ", roundName=" + roundName + "]";
    }

}
