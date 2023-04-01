package com.example.archery.entities;

public class Team extends BaseEntity {
private final String teamName;
private final String player1;
private final String player2;

public Team(String id, String teamName, String player1, String player2) {
    this.id=id;
    this.teamName = teamName;
    this.player1 = player1;
    this.player2 = player2;
}

public Team(String teamName, String player1, String player2) {
    this.teamName = teamName;
    this.player1 = player1;
    this.player2 = player2;
}

public String getTeamName() {
    return teamName;
}

public String getPlayer1() {
    return player1;
}

public String getPlayer2() {
    return player2;
}

@Override
public String toString() {
    return "Team [teamName=" + teamName + ", player1=" + player1 + ", player2=" + player2 + "]";
}
    
}
