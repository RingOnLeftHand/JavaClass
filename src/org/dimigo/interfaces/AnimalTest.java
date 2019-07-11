package org.dimigo.interfaces;

public class AnimalTest {
    public static void main(String[] args) {
        ianimal.welcome();
        ianimal[] animals ={
                new Dog(),new Cat()
        };
        for(ianimal a : animals){
            a.eat();
            a.sleep();
            a.bark();
            if(a instanceof Dog){
                ((Dog)a).wag();
            }
        }
    }
}
