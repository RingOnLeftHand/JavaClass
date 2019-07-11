package org.dimigo.oop;

public class Idol {

    public static void main(String[] args) {
        String[ ] groupName = {"방탄", "2NE1", "걸스데이"};
        String[ ][ ] memberName = {
                {"정국", "지민", "뷔","슈가","진"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };
        int i=0;
        for(String[] arr : memberName){
            System.out.println("<< "+groupName[i++]+" >>");
            for(String value : arr ){
                System.out.println(value);
            }
            System.out.println();
        }
    }
}
