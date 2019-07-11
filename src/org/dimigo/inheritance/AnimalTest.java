package org.dimigo.inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.bark();
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.bark();
        c.scratch();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal d2 = new Dog("멍멍이2");
        Animal c2 = new Cat("야옹이2");
        Animal t2 = new Tiger("호랑이2");
        d2.bark();
        c2.bark();
        t2.bark();

        Animal[] animals ={
                new Dog("머머이"),
                new Cat("야오이"),
                new Tiger("홀앙이")
        };
        for(Animal animal : animals){
            System.out.println(animal+"이다");
        }
    }
}
