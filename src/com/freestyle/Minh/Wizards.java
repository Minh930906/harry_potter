package com.freestyle.Minh;

import java.util.ArrayList;

/**
 * Created by minh on 2017.05.24..
 */
public abstract class Wizards {

    private String name;
    private String wizardstick;
    private String birthdate;
    private ArrayList<Wizards> allies;
    private ArrayList<Wizards> rivals;

    public Wizards(String name, String wizardstick, String birthdate) {
        this.name = name;
        this.wizardstick = wizardstick;
        this.birthdate = birthdate;
        allies = new ArrayList<>();
        rivals = new ArrayList<>();
    }

    public abstract void wandswishtoattack();

    public abstract void wandswishtodeffend();

    public String getName(){
        return name;
    }

    public String getWizardstick() {
        return wizardstick;
    }

    public ArrayList getAllies() {
        return allies;
    }

    public ArrayList getRivals() {
        return rivals;
    }

    public void addAlly(Wizards ally) {
        allies.add(ally);
    }

    public void addEnemy(Wizards enemy) {
        rivals.add(enemy);
    }

    public String getBirthdate() {
        return birthdate;
    }
//allie, enemies array
}
