package org.dimigo.oop;

public class Person {
///    private final String type = "영장류";
    private final String birthDate;
    private String name;

    public static final String TYPE = "영장류";

    public Person(String birthDate, String name) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "type='" + TYPE+ '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p1 = new Person("20020918" , "길동");
        Person p2 = new Person("20020201" , "길순");
        System.out.println(p1);
        System.out.println(p2);

        ////p1.type="파충류";
        System.out.println(TYPE);
    }
}