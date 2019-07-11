package org.dimigo.oop;

public class Calculator2 {
    public static double PI=3.141592;
    public static boolean powerFlag;
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
   public static int add(int num1,int num2)
    {
        return num1+num2;
    }

    public static int sub(int num1,int num2)
    {
        return num1-num2;
    }

    public static int mul(int num1,int num2)
    {
        return num1*num2;
    }

    public static double div(int num1,int num2)
    {
        return 1.*num1/num2;
    }

}
