package org.dimigo.oop;

public class Calculator {
    private int num1;
    private int num2;
    private boolean powerFlag;
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator() {
    }

    public void powerOn(){
        if(powerFlag==false) {
            powerFlag = true;
            System.out.println("전원을 켭니다.");
        }
    }
    public void powerOff(){
        if(powerFlag){
            powerFlag=false;
            System.out.println("전원을 끕니다.");
        }
    }
    public int add()
    {

        powerOn();

        return num1+num2;
    }

    public int sub()
    {

        powerOn();

        return num1-num2;
    }

    public int mul()
    {

        powerOn();

        return num1*num2;
    }

    public double div()
    {
        powerOn();
        return 1.*num1/num2;
    }

    public static void main(String[] args) {

    }
}
