package com.company;

import java.util.ArrayList;
import java.util.Random;

public class BracketRunner
{
    public BracketRunner()
    {
    }

    public static ArrayList<Team> RunRound(ArrayList<Team> input)
    {
        Random random = new Random();
        ArrayList<Team> output = new ArrayList<Team>();
        for(int i = 0; i < input.size(); i+=2)
        {
            double check = (random.nextDouble() * (input.get(i).winLoss + input.get(i).winLoss));
            if (check < input.get(i).winLoss)
            {
                output.add(input.get(i));
            }
            else
            {
                output.add(input.get(i+1));
            }
        }
        return output;
    }
}
