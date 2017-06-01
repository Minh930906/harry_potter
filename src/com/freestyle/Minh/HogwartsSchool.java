package com.freestyle.Minh;

import java.util.ArrayList;

/**
 * Created by minh on 2017.05.24..
 */
public class HogwartsSchool {

    protected ArrayList<Wizards> members;

    public HogwartsSchool() {
        members = new ArrayList<>();
    }

    public void sortingStudentToHouse(Student student) {
        int random = (int) (Math.random() * 4 + 1);
        if (random == 1) {
            student.setStudentHouseGryffindor();
            members.add(student);
        } else if (random == 2) {
            student.setStudentHouseSlytherin();
            members.add(student);
        } else if (random == 3) {
            student.setStudentHouseHufflepuff();
            members.add(student);
        } else {
            student.setStudentHouseRavenclaw();
            members.add(student);
        }
    }

    public ArrayList getAll(){
        return members;
    }

    public void addStudent(Student student){
        members.add(student);
    }

    public void addTeacher(Teacher teacher){
        members.add(teacher);
    }
}
