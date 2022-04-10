package sda.java.advanced.basics.generics.nonGeneric;

import sda.java.advanced.basics.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private String leagueName;
    private List<Team> teams;

    public League(String leaguName) {
        this.leagueName = leaguName;
        this.teams = new ArrayList<>();
    }

    public boolean addTeam(Team team) {
        if(!teams.contains(team)) {
            System.out.println("Adding " + team.getName() + " to " + leagueName);
            return teams.add(team);
        }
        System.out.println("Team " + team + "already in" + leagueName);
        return false;
    }

    public void printTable() {
        Collections.sort(teams);
        System.out.println(leagueName + " table: ");
        for (Team team : teams) {
            System.out.println(team.getName() + ", points: " + team.getPoins());
        }
    }
}
