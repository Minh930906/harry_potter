package com.freestyle.Minh;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Keeper ron = new Keeper("Ron wesley", "nothing", "1993-02-02", "Rat", "Gryffindor");
        Seeker harry = new Seeker("Harry Potter","nothing","1990-06-09","owl","Gryffindor");
        Beater asd=new Beater("asd","asd","1995-05-07","rat","Gryffindor");
        Beater dsa=new Beater("lolasd","asd","1995-05-07","rat","Gryffindor");
        Chaser xyz =new Chaser("qweasd","adsad","1997-05-04","bear","Gryffindor");
        Chaser xyc =new Chaser("qsd","adsad","1997-05-04","bear","Gryffindor");
        Chaser asdyx =new Chaser("qwefdfsf","adsad","1997-05-04","bear","Gryffindor");
        ArrayList<Chaser> a=new ArrayList<>();
        a.add(xyc);
        a.add(asdyx);
        a.add(xyz);
        ArrayList<Beater> b=new ArrayList<>();
        b.add(asd);
        b.add(dsa);
        Team Gryffindor = new Team(ron,harry,a,b);
        Keeper csirke = new Keeper("Ron wesley", "nothing", "1993-02-02", "Rat", "Slytherin");
        Seeker meki = new Seeker("Harry Potter","nothing","1990-06-09","owl","Slytherin");
        Beater kfc=new Beater("asd","asd","1995-05-07","rat","Slytherin");
        Beater wendy=new Beater("lolasd","asd","1995-05-07","rat","Slytherin2");
        Chaser burgerking =new Chaser("burger","adsad","1997-05-04","bear","Slytherin");
        Chaser subway =new Chaser("subway","adsad","1997-05-04","bear","Slytherin");
        Chaser johncena =new Chaser("john cena","adsad","1997-05-04","bear","Slytherin");
        ArrayList<Chaser> c=new ArrayList<>();
        c.add(burgerking);
        a.add(subway);
        a.add(johncena);
        ArrayList<Beater> d=new ArrayList<>();
        b.add(wendy);
        b.add(kfc);
        Team otherteam = new Team(csirke,meki,c,d);

        Quidditch lolo=new Quidditch(Gryffindor,otherteam);
        lolo.matchtime();
        //        Chaser harry = new Chaser("harry", "halál", "1993-06-07", "owl", "Gryffindor", 50, 60, 70, 80, 75);
//        Chaser kane = new Chaser("kane", "halál", "1993-06-07", "owl", "Gryffindor", 50, 60, 70, 80, 55);
//        Chaser west = new Chaser("west", "halál", "1993-06-07", "owl", "Gryffindor", 50, 60, 70, 80, 60);
//        Seeker ginger = new Seeker("ginger", "ginger", "something", "cat", "Griffindor", 20);
//        Beater moltres = new Beater("moltres", "cat tail", "sadasd", "asdasd", "sadasd", 60, 70);
//        Beater zapdos = new Beater("Zapdos", "cat tail", "sadasd", "asdasd", "sadasd", 70, 80);
//
//        Keeper kecske = new Keeper("Dan Biltzerian", "nothing", "1993-02-02", "Rat", "Slytherin", 30, 50, 40);
//        Chaser majom = new Chaser("Donkey Kong", "halál", "1993-06-07", "owl", "Slytherin", 50, 60, 70, 80, 80);
//        Chaser cena = new Chaser("Joooohn Ceeena", "halál", "1993-06-07", "owl", "Slytherin", 50, 60, 70, 80, 70);
//        Chaser triplah = new Chaser("Tripla H", "halál", "1993-06-07", "owl", "Slytherin", 50, 60, 70, 80, 60);
//        Seeker rula = new Seeker("rulez", "ginger", "something", "cat", "Griffindor", 20);
//        Beater xpeke = new Beater("xpeke", "cat tail", "sadasd", "asdasd", "sadasd", 60, 70);
//        Beater fox = new Beater("fox", "cat tail", "sadasd", "asdasd", "sadasd", 70, 80);
//
//        Quidditch match = new Quidditch(ron, moltres, zapdos, ginger, harry, west, kane, kecske, xpeke, fox, rula, triplah, cena, majom);
//
//        match.matchtime();


//        Student a= new Student("harry","halál","1993-06-07","owl","Slytherin","snake");
//        Student b= new Student("marry","szarv","1989-04-08","rat");
//        Student c= new Student("carry","ág","1995-05-04","cat","Hufflepuff","Badger");
//        Student d= new Student("terry","feather","1998-10-30","mouse");
//        Student e= new Student("fancy","zokni","1994-11-30","hedgehog");
//
//        ArrayList<Student> students=new ArrayList<>();
//        HogwartsSchool q =new HogwartsSchool();
//        q.sortingStudentToHouse(b);
//        a.addAlly(b);
//        q.sortingStudentToHouse(d);
//        q.sortingStudentToHouse(e);
//        q.addStudent(a);
//        q.addStudent(c);
//        students=q.getAll();
//
//        ArrayList<Wizards> asd = new ArrayList<>();
//        asd=a.getAllies();
//
//        for(int i=0;i<asd.size();i++)
//        {
//            System.out.println(asd.get(i).getName()+"   allies");
//        }
//
//        for (int i=0;i<students.size();i++){
//            System.out.println(students.get(i).getName()+" "+students.get(i).getHouse());
//        }
//
    }
}
