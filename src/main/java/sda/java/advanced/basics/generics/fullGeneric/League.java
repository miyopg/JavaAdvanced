package sda.java.advanced.basics.generics.fullGeneric;

import sda.java.advanced.basics.generics.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T> {
    private String leaguName;
    private List<T> teams;

    public League(String leaguName) {
        this.leaguName = leaguName;
        teams = new ArrayList<>();
    }

    // dobry kandydat na metodę generyczną
    public boolean addTeam(T team) {
        if(!teams.contains(team)) {
            return teams.add(team);
        }
        System.out.println(team.toString() + " already in " + leaguName);
        return false;
    }
        //Ta metoda nie jest dobrym kandydatem do klasy generycznej,
        // bo wymusza rzutowanie - wyjaśnienie poniżej przy sortowaniu
    public void printTable() {
        //  Collections.sort(teams); // nie da się zrobić tak po prostu .sort bo java nie wie czy klasa
        // którą przekażemy jako "T" będzie rozszerzała Comparable
        // więc tutaj MUSIMY powiedzieć jawnie co za klasa przychodzi

        Collections.sort((List<Team>) teams);
        System.out.println(leaguName + " table: ");
        for (T team : teams) {
            // wypisywanie tez nie jest dowolne bo bazujemy na założeniu, że w klasie będzie metoda
            // getName() i metoda getPoints()
            System.out.println(((Team) team).getName() + ", points: " + ((Team) team).getPoins());
        }
    }


}
