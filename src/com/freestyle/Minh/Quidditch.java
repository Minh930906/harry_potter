package com.freestyle.Minh;


import java.util.ArrayList;
import java.util.Collections;

public class Quidditch {

    private Team team1;
    private Team team2;

    public Quidditch(Team team1,Team team2) {
        this.team1=team1;
        this.team2=team2;
    }

    public void matchtime() {
        int random = (int) (Math.random() * 2 + 1);
        if(random==1){
            Chaser a;
            a=team1.getrandomchaser();
            System.out.println(a.getName()+" team:"+a.getHouse());
        }
        else {
            Chaser b;
            b=team2.getrandomchaser();
            System.out.println(b.getName()+" team:"+b.getHouse());
        }
    }

}
