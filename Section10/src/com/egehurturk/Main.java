package com.egehurturk;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>(); // raw type of ArrayList
//        items.add(1);
//        items.add(2);
//        items.add(3);
//        // items.add("tim");
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
        FootballPlayer john = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer tim = new SoccerPlayer("Tim");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(john);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(tim);

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        // Team<String> brokenTeam = new Team<>("this wont work");
        // brokenTeam.addPlayer("no-one"); // WE WILL GET AN EXCEPTION
        Team<SoccerPlayer> brokenTeam = new Team<>("this wont work");
        brokenTeam.addPlayer(tim);

        System.out.println(adelaideCrows.numPlayers());
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for(int i: n) {

            System.out.println(i * 2);
        }
    }
}

// Object can be anything
// If we don't use generics with ArrayList, then we must cast the items when accessing them
// diamond operator (<>): we can use ArrayList<> and it will get the left side type of the equation