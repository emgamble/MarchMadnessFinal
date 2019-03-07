package com.company;

public class Team
{
    public String name;
    public double winLoss;

    public Team(String name, double winLoss)
    {
        this.name = name;
        this.winLoss = winLoss;
    }
    public String getName(){
        return name;
    }
}