package com.company;

public class Player {

    private String Name;
    private int Runs;
    private boolean Out;

    public Player(String name, int runs, boolean out){
        Name = name;
        Runs = runs;
        Out = out;
    }

    public void display(){
        System.out.println(this.Name + " scored " + this.Runs);
        System.out.println(this.Name + (this.Out? " is out.": " is not out"));
    }

    String getName(){
        return this.Name;
    }

    void addRuns(int num){
        this.Runs += num;
    }

    int getRuns() {return this.Runs;}

    void pOut(boolean isOut){
        this.Out = isOut;
//        return Out;
    }



}
