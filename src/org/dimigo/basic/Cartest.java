package org.dimigo.basic;
class Main{
    public static void main(String[] args) {
        Cartest h=new Cartest();
        Cartest k=new Cartest();
        Cartest s=new Cartest();
        h.setCompany("현대");
        k.setCompany("기아");
        s.setCompany("삼성");
        h.setModel("제네시스");
        k.setModel("K7");
        s.setModel("SM7");
        h.setColor("검정색");
        k.setColor("흰색");
        s.setColor("회색");
        h.setMaxSpeed(225);
        k.setMaxSpeed(246);
        s.setMaxSpeed(200);
        h.setPrice(50000000);
        k.setPrice(40000000);
        s.setPrice(38000000);
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
class Cartest {

    public String company;
    public String model;
    public String color;
    public int maxSpeed;
    public int price;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
