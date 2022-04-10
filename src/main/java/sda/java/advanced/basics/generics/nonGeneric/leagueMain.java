package sda.java.advanced.basics.generics.nonGeneric;

import sda.java.advanced.basics.generics.FootballTeam;
import sda.java.advanced.basics.generics.Team;
import sda.java.advanced.basics.generics.TeamLevel;
import sda.java.advanced.basics.generics.VolleyballTeam;

public class leagueMain {
    public static void main(String[] args) {
        League league = new League("Primiera Division");

        Team team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFESSIONAL);
        Team team2 = new FootballTeam("Real Madrid", TeamLevel.PROFESSIONAL);
        Team team3 = new FootballTeam("Atletico de Madrid", TeamLevel.PROFESSIONAL);
        Team team4 = new FootballTeam("Valencia CF", TeamLevel.PROFESSIONAL);
        team1.setPoins(30);
        team2.setPoins(25);
        team3.setPoins(33);
        team4.setPoins(28);

        league.addTeam(team1);
        league.addTeam(team2);
        league.addTeam(team3);
        league.addTeam(team4);
        System.out.println("====================");
        league.printTable();
        System.out.println("====================");

        Team team5 = new VolleyballTeam("Asseco Resovia",TeamLevel.PROFESSIONAL);
        league.addTeam(team5);
        team5.setPoins(27);
        league.printTable();
    }
}
