package org.dimigo.inheritance;

public class PersonTest {
    public static void main(String[] args) {
        Person p = new Person("아이유",26,162,48);
        System.out.println(p);
        p.eat();
        p.sleep();
        Student s = new Student("김한샘",18,    70,180,"2509");
        System.out.println(s);
        s.eat();
        s.sleep();
        Teacher t= new Teacher("박성수",30,190,65,"정통");
        System.out.println(t);
        t.eat();
        t.sleep();
        t.teach();
        t.doTask();
    }

}
