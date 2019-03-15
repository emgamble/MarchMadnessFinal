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
        String temp2 = teamScanner.next();
        double SRS = Double.parseDouble(temp2);
        teams.add(new Team(teamName, winLoss, SRS));
        while (teamScanner.hasNext()) {
            teamName = teamScanner.next();
            temp = teamScanner.next();
            temp2 = teamScanner.next();
            //System.out.println("t" + temp);
            //System.out.println("x" + teamName);
            winLoss = Double.parseDouble(temp);
            SRS = Double.parseDouble(temp2);


            teams.add(new Team(teamName.substring(2), winLoss, SRS));
        }

        // System.out.println(teams.get(0).name);
        //

        ArrayList<String> TeamsList = new ArrayList<String>();
        Scanner teamsListScanner = new Scanner(new File("competingTeams.txt"));
        while(teamsListScanner.hasNextLine()){
            TeamsList.add(teamsListScanner.nextLine());
        }
        //  System.out.println(TeamsList);
        //String names = teamsListScanner.next();
//
       // ArrayList<String> competingString = new ArrayList<>();
        ArrayList<Team> competingTeams = new ArrayList<>();
      //  System.out.println(teams.get(0).name);
        for (int i = 0; i < TeamsList.size(); i++)
        {
            for(int j = 0; j < teams.size(); j++)
            {
            //    System.out.println(TeamsList.get(i));
            //    System.out.println(teams.get(j).name);
                if (TeamsList.get(i).equalsIgnoreCase(teams.get(j).name))
                {
                    competingTeams.add(teams.get(j));
                    break;
                }
            }
        }
        for (int j = 1; j < 7; j++) {
            System.out.println("Winning Teams Round " + j + ":");
            ArrayList<Team> tempTeams = BracketRunner.RunRound(competingTeams);
            for (int i = 0; i < tempTeams.size(); i++) {
                System.out.println(tempTeams.get(i).name);
            }
            competingTeams = tempTeams;
            System.out.println(tempTeams.size());
        }
      //  for (int i = 0; i < teams.size(); i++) {
        //    System.out.println(teams.get(i).SRS);
        //}
    //g
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