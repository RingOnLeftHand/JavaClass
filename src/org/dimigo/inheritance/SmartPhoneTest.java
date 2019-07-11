package org.dimigo.inheritance;

public class SmartPhoneTest {
    public static void main(String[] args) {
        IPhone IP=new IPhone("iPhone XS","애플", 1370000);
        System.out.println(IP);
        IP.turnOn();
        IP.pay();
        IP.UseAirDrop();
        IP.turnOff();
        System.out.println();
        Galaxy G=new Galaxy("갤럭시 S10","삼성", 1500000);
        System.out.println(G);
        G.turnOn();
        G.pay();
        G.useWirelessCharging();
        G.turnOff();
    }
}
