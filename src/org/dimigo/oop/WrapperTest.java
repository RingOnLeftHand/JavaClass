package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        ////프리미티브 데이터타입을 감싸줌
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.SIZE);
        //박싱
        // 1 생성자
        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));
        Integer i3 = Integer.valueOf(100);
        Integer i4 = Integer.valueOf("100");
        Double d=Double.valueOf(3.14);
        //언박싱
        int r1=i3.intValue();
        double r2 = d.doubleValue();

        //문자열 파라미티브타입
        int a = Integer.parseInt("100");
        double b = Double.parseDouble("3.14");

        System.out.println(args[0]);
        System.out.println(args[1]);

    }
}
