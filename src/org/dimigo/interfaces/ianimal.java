package org.dimigo.interfaces;

public interface ianimal {
    ////상수   자동으로 public static final이 붙음
    String FARM_NAME ="디미 동물농장";

    ////추상 메소드   자동으로 public abstract이 붙음
    void bark();
    ////디폴트 메소드   구현부 /자동으로 public
    default void eat(){
        System.out.println("냠냠");
    };
    default void sleep(){
        System.out.println("쿨쿨");
    };
    static void welcome(){
        System.out.println(FARM_NAME+"에 오신것을 환영합니다");
    }

}
