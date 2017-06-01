package com.freestyle.Minh;

/**
 * Created by minh on 2017.05.24..
 */
public class Teacher extends Wizards {

    private String teacherEducation;

    public Teacher(String name, String wizardstick, String birthdate, String teacherEducation) {
        super(name, wizardstick, birthdate);
        this.teacherEducation = teacherEducation;
    }

    public String getTeacherEducation() {
        return teacherEducation;
    }
    public void wandswishtoattack(){
        System.out.println("Capitulatus");
    }

    public void wandswishtodeffend(){
        System.out.println("Finite Incantatem!!!!");
    }

}
