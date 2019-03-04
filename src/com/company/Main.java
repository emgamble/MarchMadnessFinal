package com.company;
import sun.plugin.javascript.navig.Array;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //Trying to read from textfile
        File teamInfo = new File("teamInfo.txt");
        Scanner teamScanner = new Scanner(teamInfo);
        teamScanner.useDelimiter(",");
	    ArrayList<Team> teams = new ArrayList<Team>();
        String teamName = teamScanner.next();
	    String temp = teamScanner.next();
	    double winLoss = Double.parseDouble(temp);

	    teams.add(new Team(teamName,winLoss));
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