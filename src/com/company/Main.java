package com.company;
import sun.plugin.javascript.navig.Array;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Trying to read from textfile

        Scanner teamScanner = new Scanner(new File("teamInfo.txt"));
        teamScanner.useDelimiter(",");
        ArrayList<Team> teams = new ArrayList<Team>();
        String teamName = teamScanner.next();
        String temp = teamScanner.next();
        double winLoss = Double.parseDouble(temp);
        teams.add(new Team(teamName, winLoss));
        while (teamScanner.hasNext()) {
            teamName = teamScanner.next();
            temp = teamScanner.next();
            //System.out.println("t" + temp);
            //System.out.println("x" + teamName);
            winLoss = Double.parseDouble(temp);

            teams.add(new Team(teamName.substring(1), winLoss));
        }
       // System.out.println(teams.get(0).name);

        ArrayList<String> TeamsList = new ArrayList<String>();
        Scanner teamsListScanner = new Scanner(new File("competingTeams.txt"));
        while(teamsListScanner.hasNextLine()){
            TeamsList.add(teamsListScanner.next());
        }
      //  System.out.println(TeamsList);
        //String names = teamsListScanner.next();


       // ArrayList<String> competingString = new ArrayList<>();
        ArrayList<Team> competingTeams = new ArrayList<>();

        for (int i = 0; i < TeamsList.size(); i++)
        {
            for(int j = 0; j < teams.size(); j++)
            {
                if (TeamsList.get(i).equalsIgnoreCase(teams.get(j).name))
                {
                    competingTeams.add(teams.get(j));
                    break;
                }
            }
        }
        System.out.println(TeamsList.size());
        System.out.println("Winning Teams :");


        ArrayList<Team> tempTeams = BracketRunner.RunRound(competingTeams);
        System.out.println(tempTeams.size());
        for (int i = 0; i < tempTeams.size(); i++)
            {
                System.out.println(tempTeams.get(i).name);
            }


    }
}
//ArrayList<String> text = new ArrayList<>();
//        while (teamScanner.hasNextLine()){
//            text.add(teamScanner.nextLine());
//            lineCount++;
//
//
//        }
//        for (int i = 0; i < lineCount; i++) {
//            System.out.println(text.get(i));
//        }