package com.freestyle.Minh;

import java.util.ArrayList;

public class Student extends Wizards {
    private String studentAnimal;
    private String house;

    public Student(String name, String wizardstick, String birthdate, String studentAnimal) {
        super(name, wizardstick, birthdate);
        this.studentAnimal = studentAnimal;
    }

    public Student(String name, String wizardstick, String birthdate, String studentAnimal, String house) {
        super(name, wizardstick, birthdate);
        this.studentAnimal = studentAnimal;
        this.house = house;
    }


    @Override
    public void wandswishtoattack() {
        System.out.println("Capitulatus");
    }

    public void wandswishtodeffend() {
        System.out.println("Finite Incantatem!!!!");
    }

    public String getStudentAnimal() {
        return studentAnimal;
    }

    public String getHouse() {
        return house;
    }

    public void setStudentHouseGryffindor() {
        this.house = "Gryffindor";
    }

    public void setStudentHouseSlytherin() {
        this.house = "Slytherin";
    }

    public void setStudentHouseHufflepuff() {
        this.house = "Hufflepuff";
    }

    public void setStudentHouseRavenclaw() {
        this.house = "Ravenclaw";
    }


}
