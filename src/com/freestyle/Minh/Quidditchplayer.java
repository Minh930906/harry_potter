package com.freestyle.Minh;

public class Quidditchplayer extends Student {

    private int speed;

    public Quidditchplayer(String name, String wizardstick, String birthdate, String studentAnimal, String house) {
        super(name, wizardstick, birthdate, studentAnimal, house);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


}
