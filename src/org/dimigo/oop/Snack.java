package org.dimigo.oop;

public class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack() {
    }

    public Snack(String name, String company, int price, int number) {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    @Override
    public String toString() {
        StringBuilder M =new StringBuilder();
        M.append("이름 : ").append(name).append("\n제조사 : ").append(company).append("\n가격 : ").append(String.format("%,d원",price)).append("\n개수 : ").append(number).append("개\n");
        return M.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public int calcPrice(){
        return this.number*this.price;
    }
}
class main  {
    public static void main(String[] args) {
        int price=0;
        Snack[] S={
                new Snack("새우깡","농심",1100,2),
                new Snack("콘칩","크라운",1200,1),
                new Snack("허니버터칩","해태",1500,4)
        };
        for(int i=0;i<3;i++)
        {
            price+=S[i].calcPrice();
            System.out.println(S[i].toString());

        }

        System.out.printf("총 구매 금액 : %,d원", price);
    }
}