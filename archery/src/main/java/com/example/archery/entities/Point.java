package com.example.archery.entities;

public class Point extends BaseEntity {
    private final String circleName;
	private final int point;
    private final String roundName;
    
    public Point(String id, String circleName, int point, String roundName) {
        this.id=id;
        this.circleName = circleName;
        this.point = point;
        this.roundName = roundName;
    }

    public Point(String circleName, int point, String roundName) {       
        this.circleName = circleName;
        this.point = point;
        this.roundName = roundName;
    }

    public String getCircleName() {
        return circleName;
    }

    public int getPoint() {
        return point;
    }
    public String getRoundName() {
        return roundName;
    }

    @Override
    public String toString() {
        return "Point [circleName=" + circleName + ", point=" + point + ", roundName=" + roundName + "]";
    }
	

       
}
