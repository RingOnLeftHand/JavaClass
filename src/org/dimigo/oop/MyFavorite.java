package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        int i=0;
        int chk;
        String[ ] questions = {
                "가장 좋아하는 가수는?",
                "가장 좋아하는 배우는?",
                "가장 좋아하는 과목은?"
        };
        String[] answers = {
                "아이유",
                "원빈",
                "자료구조"
        };
        String[] M={
                "가수는? ","배우는? ","과목은? "
        };


        String answer;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        for(;i!=9;)
        {
            System.out.println("------------------\n1. 질문 선택\n2. 정답 공개\n9. 프로그램 종료\n------------------\n메뉴 선택 => ");

            i= scanner.nextInt();
            if(i==1)
            {
                System.out.print("가장 좋아하는 "+M[chk = random.nextInt(questions.length)]);
                answer=scanner.next();
                if(answers[chk].equals(answer)){
                    System.out.println("정답입니다!");
                }
                else
                {
                    System.out.println("틀렸습니다!");
                }

            }
            else if(i==2)
            {
                System.out.println("<< 정답 출력 >>");
                for(int j=0;j<3;j++)
                {
                    StringBuilder TWO=new StringBuilder();
                    TWO.append("가장 좋아하는 ");TWO.append(M[j]);
                    TWO.append(answers[j]+"입니다");
                    System.out.println(TWO);
                }
            }
            else if(i==9)
            {
                System.out.println("Bye~");
                break;
            }
            else{
                System.out.println("없는 메뉴입니다.");
            }

        }
    }
}
