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
            int win = 0;
            int win0 = 0;
            for (int j = 0; j < 10001; j++)
                {
                    double check = (((input.get(i).winLoss + input.get(i).winLoss) + (input.get(i).SRS + input.get(i).SRS)) *  random.nextDouble());
                    if (check < (input.get(i).winLoss + input.get(i).SRS))
                    {
                        win++;
                    }
                    else
                    {
                        win0++;
                    }
                }
            if (win > win0)
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
//
