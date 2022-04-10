package sda.java.advanced.basics.generics.withBoundaries;

import sda.java.advanced.basics.generics.FootballTeam;
import sda.java.advanced.basics.generics.Team;
import sda.java.advanced.basics.generics.TeamLevel;
import sda.java.advanced.basics.generics.VolleyballTeam;

public class LeagueMain {
    public static void main(String[] args) {
        League<FootballTeam> footballLeague = new League<>("Primiera Divison");
        League<VolleyballTeam> volleyballTeamLeague = new League<>("Plus Liga");

        FootballTeam team1 = new FootballTeam("FC Barcelona", TeamLevel.PROFESSIONAL);
        FootballTeam team2 = new FootballTeam("Real Madrid", TeamLevel.PROFESSIONAL);
        Team team3 = new FootballTeam("Atletico Madrid CF", TeamLevel.PROFESSIONAL);
        Team team4 = new FootballTeam("Valencia CF", TeamLevel.PROFESSIONAL);

        team1.setPoins(30);
        team2.setPoins(40);
        team3.setPoins(10);
        team4.setPoins(20);
        footballLeague.addTeam(team1);
        footballLeague.addTeam(team2);
        footballLeague.addTeam((FootballTeam) team3); // footballLeague jest okreslona jako League<FootballTeam>
        // więc trzeba jawine powiedzieć kompilatorowi że team3 ma trakotwać jak FootBallTeam
        footballLeague.addTeam((FootballTeam) team4);
        footballLeague.addTeam(team1);
        System.out.println("===================");
        footballLeague.printTable();
        System.out.println("===================");

    }
}
