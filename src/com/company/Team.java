package com.company;

public class Team
{
    public String name;
    public double winLoss;
    public double SRS;

    public Team(String name, double winLoss, double teamSRS)
    {
        this.name = name;
        this.winLoss = winLoss;
        this.SRS = (teamSRS + 30) / 60;
    }
    public String getName(){
        return name;
    }

}