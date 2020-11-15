package com.genericschallenge;

import com.egehurturk.Team;

import java.util.ArrayList;
import java.util.Collections;

public class LeagueTable<T extends Team> {
    private String name;
    private ArrayList<T> teams = new ArrayList<>();

    public LeagueTable(String name) {
        this.name = name;
    }

    public boolean add(T team) {
        if (teams.contains(team)) {
            return false;
        }
        teams.add(team);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(teams);
        for (T t: teams) {
            System.out.println(t.getName() + ": " + t.ranking());
        }
    }
}
