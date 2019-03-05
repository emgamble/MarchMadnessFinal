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
        System.out.println(teams.get(0).name);


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