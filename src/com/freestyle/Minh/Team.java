package com.freestyle.Minh;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by minh on 2017.05.30..
 */
public class Team {

    private ArrayList<Chaser> chasers;
    private Seeker seeker;
    private ArrayList<Beater> beaters;
    private Keeper keeper;

    public Team(Keeper keeper,Seeker seeker,ArrayList<Chaser> chasers,ArrayList<Beater> beaters) {
        this.seeker=seeker;
        this.beaters=beaters;
        this.keeper=keeper;
        this.chasers=chasers;

    }

    public Chaser getrandomchaser() {
        Collections.shuffle(chasers);
        return chasers.get(0);
    }

    public Chaser getChaserOne(){
        return chasers.get(0);
    }

    public Chaser getChaserTwo(){
        return chasers.get(1);
    }

    public Chaser getChaserThree(){
        return chasers.get(2);
    }

    public Seeker getSeeker() {
        return seeker;
    }

    public Keeper getKeeper() {
        return keeper;
    }

    //not goooooood
    public Chaser getrandomplayertopass(Chaser passingplayer){
        Chaser freeplayer=getrandomchaser();
        while (passingplayer.getName()==freeplayer.getName()){
            freeplayer=getrandomchaser();
        }
        return freeplayer;
    }


}
