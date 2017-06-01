package com.freestyle.Minh;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by minh on 2017.05.25..
 */
class WizardsTest {
//    Student student;
//    @BeforeEach
//    public void create(){
//        student=mock(Student.class);
//        when(student.getBirthdate()).thenReturn("2005-05-09");
//    }

    @Test
    public void TestIsGetAllies() {
        Student test = new Student("Háárry", "körmös", "1994-05-06", "kutya");
        Student test2 = new Student("Magdi", "karmos", "1993-08-06", "kutya");
        test.addAlly(test2);
        ArrayList<Wizards> a = test.getAllies();
        assertEquals("Magdi", a.get(0).getName());
        assertEquals("1993-08-06", a.get(0).getBirthdate());
    }

    @Test
    public void TestIsgetRivals() {
        Student test = new Student("Háárry", "körmös", "1994-05-06", "kutya");
        Student test2 = new Student("Mellfoly", "karmos", "1994-05-06", "kigyo");
        test.addEnemy(test2);
        ArrayList<Student> a = test.getRivals();
        assertEquals("kigyo", a.get(0).getStudentAnimal());
        assertEquals("karmos", a.get(0).getWizardstick());
    }

    @Test
    public void TestIsSortingStudent() {
        Student d = new Student("terry", "feather", "1998-10-30", "mouse");
        HogwartsSchool school = new HogwartsSchool();
        school.sortingStudentToHouse(d);
        assertNotNull(d.getHouse());
    }

    @Test
    public void TestIsAddStudent() {
        Student voros = new Student("Vöröske", "Patkányfarok", "1993-09-06", "motkány");
        HogwartsSchool school = new HogwartsSchool();
        school.addStudent(voros);
        assertEquals(1, school.getAll().size());
    }

    @Test
    public void TestIsSetGryffindor() {
        Student voros = new Student("Vöröske", "Patkányfarok", "1993-09-06", "motkány");
        voros.setStudentHouseGryffindor();
        assertEquals("Gryffindor", voros.getHouse());
    }

    @Test
    public void TestIsSetSlytherin() {
        Student voros = new Student("Vöröske", "Patkányfarok", "1993-09-06", "motkány");
        voros.setStudentHouseSlytherin();
        assertEquals("Slytherin", voros.getHouse());
    }

    @Test
    public void TestIsSetHufflepuff() {
        Student voros = new Student("Vöröske", "Patkányfarok", "1993-09-06", "motkány");
        voros.setStudentHouseHufflepuff();
        assertEquals("Hufflepuff", voros.getHouse());
    }

    @Test
    public void TestIsSetRavenclaw() {
        Student voros = new Student("Vöröske", "Patkányfarok", "1993-09-06", "motkány");
        voros.setStudentHouseRavenclaw();
        assertEquals("Ravenclaw", voros.getHouse());
    }

    @Test
    public void TestIsTeacher() {
        Teacher test = new Teacher("Python", "hald-blood stick", "1956-07-08", "Essence making");
        assertEquals("Python", test.getName());
        assertEquals("Essence making", test.getTeacherEducation());
    }

}