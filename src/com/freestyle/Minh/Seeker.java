package com.freestyle.Minh;

//1 per team

import java.time.LocalDate;
import java.util.Random;

public class Seeker extends Quidditchplayer {

    public Seeker(String name, String wizardstick, String birthdate, String studentAnimal, String house) {
        super(name, wizardstick, birthdate, studentAnimal, house);
        generateRandomstat();
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

    public void setWorldclassplayer() {
        Random r = new Random();
        int Low = 75;
        int High = 95;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);
    }

    public void setAvarageplayer() {
        Random r = new Random();
        int Low = 60;
        int High = 80;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);
    }

    public void setBadplayer() {
        Random r = new Random();
        int Low = 50;
        int High = 70;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(Result);

    }

    public void setGoodform() {
        Random r = new Random();
        int Low = 1;
        int High = 5;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
    }

    public void setAvarageform() {
        Random r = new Random();
        int Low = -2;
        int High = 3;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
    }

    public void setBadform() {
        Random r = new Random();
        int Low = -10;
        int High = -5;
        int Result = r.nextInt(High - Low) + Low;
        setSpeed(getSpeed() + Result);
    }

    public void catchthegoldenball(){
        Random r =new Random();
        float chance = r.nextFloat();
        if(chance<10.0f){
            System.out.println("Ball have been caught the winner is "+getHouse()+"!!!");
        }
    }
}
