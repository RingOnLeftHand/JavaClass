package org.dimigo.oop;

public class CarTest2 {
    public static void main(String[] args) {
        Car3 h=new Car3("현대","제네시스","검정색",225,50000000);
        Car3 k=new Car3("기아","K7","흰색",246);
        Car3 s=new Car3("삼성","SM7","회색");
        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : "+h.getCompany()+"자동차");
        System.out.println("모델명 : "+h.getModel());
        System.out.println("색상 : "+h.getColor());
        System.out.println("최대속도 : "+h.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원", h.getPrice());

        System.out.println("\n\n제조사명 : "+k.getCompany()+"자동차");
        System.out.println("모델명 : "+k.getModel());
        System.out.println("색상 : "+k.getColor());
        System.out.println("최대속도 : "+k.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원", k.getPrice());

        System.out.println("\n\n제조사명 : "+s.getCompany()+"자동차");
        System.out.println("모델명 : "+s.getModel());
        System.out.println("색상 : "+s.getColor());
        System.out.println("최대속도 : "+s.getMaxSpeed()+"km");
        System.out.printf("가격 : %,d원", s.getPrice());
    }
}
