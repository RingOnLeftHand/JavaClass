package org.dimigo.inher2;

import org.dimigo.inheritance.Animal;

public class PersonTest2 {
    private static void greeting(Person p){

        System.out.println(p);
        p.sayHello();
        p.sayBye();
        System.out.println();
    }
    public static void main(String[] args) {
        Person[] people ={
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };
        for(Person pers : people){
            PersonTest2.greeting(pers);
        }
    }
}
