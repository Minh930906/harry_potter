package com.freestyle.Minh;

//3 per team


import java.util.Random;

public class Chaser extends Quidditchplayer {

    private int shoot;
    private int accuracy;
    private int pass;
    private int passinterrupt;

    public Chaser(String name, String wizardstick, String birthdate, String studentAnimal, String house) {
        super(name, wizardstick, birthdate, studentAnimal, house);
        generateRandomstat();
    }

    public int getShoot() {
        return shoot;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public int getPass() {
        return pass;
    }

    public int getPassinterrupt() {
        return passinterrupt;
    }

    public void generateRandomstat() {
        int random = (int) (Math.random() * 3 + 1);
        if (random == 1) {
            setWorldclassplayer();
            random = (int) (Math.random() * 3 + 1);
            if (random == 1) {
                setGoodform();
            } else if (random == 2) {
                setAvarageform();
            } else {
                setBadform();
            }
        } else if (random == 2) {
            setAvarageplayer();
            random = (int) (Math.random() * 3 + 1);
            if (random == 1) {
                setGoodform();
            } else if (random == 2) {
                setAvarageform();
            } else {
                setBadform();
            }
        } else {
            setBadplayer();
            random = (int) (Math.random() * 3 + 1);
            if (random == 1) {
                setGoodform();
            } else if (random == 2) {
                setAvarageform();
            } else {
                setBadform();
            }
        }
    }

    public void setGoodform() {
        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(getShoot() + Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(getAccuracy() + Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(getPass() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(getPassinterrupt() + Result);
    }

    public void setAvarageform() {
        Random r = new Random();
        int Low = -2;
        int High = 3;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(getShoot() + Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(getAccuracy() + Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(getPass() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(getPassinterrupt() + Result);
    }

    public void setBadform() {
        Random r = new Random();
        int Low = -10;
        int High = -5;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(getShoot() + Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(getAccuracy() + Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(getPass() + Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(getPassinterrupt() + Result);
    }

    public void setWorldclassplayer() {
        Random r = new Random();
        int Low = 75;
        int High = 95;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(Result);
    }

    public void setAvarageplayer() {
        Random r = new Random();
        int Low = 60;
        int High = 80;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(Result);
    }

    public void setBadplayer() {
        Random r = new Random();
        int Low = 50;
        int High = 70;
        int Result = r.nextInt(High - Low) + Low;
        setShoot(Result);
        Result = r.nextInt(High - Low) + Low;
        setAccuracy(Result);
        Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);
        Result = r.nextInt(High - Low) + Low;
        setPass(Result);
        Result = r.nextInt(High - Low) + Low;
        setPassinterrupt(Result);
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public void setPassinterrupt(int passinterrupt) {
        this.passinterrupt = passinterrupt;
    }

    public void shoot(Team team) {
        System.out.println(getName() + " " + "is shooting");
        int random = (int) (Math.random() * 2 + 1);
        if (random == 1) {
            if ((getShoot() + getAccuracy()) / 2 > (team.getKeeper().getBlock() + team.getKeeper().getReflex()) / 2) {
                System.out.println(getName() + " " + "scored!!!");
            } else {
                System.out.println(team.getKeeper().getName() + " blocked!!! What a save!!!");
            }
        } else {
            System.out.println(getName() + " " + "missed!!Unlucky for" + " " + getHouse());
        }
    }

    public void pass(Chaser interrupter, Chaser teammate) {
        if ((interrupter.getPassinterrupt() + interrupter.getSpeed()) / 2 > (getPass() + getAccuracy()) / 2) {
            System.out.println(getName() + " " + "passing but his/her ball has been caught by" + " " + interrupter.getName() + "!!!");
        } else {
            System.out.println(getName() + " " + "is passing to" + " " + teammate.getName() + "!");
        }

    }

//    public void chaseraction(){
//        int random = (int) (Math.random() * 2 + 1);
//        if(random==1){
//
//        }
//
//    }

}
