package org.dimigo.oop;

public class ParamArray {
    public static void main(String[] args) {
        int[] intArr={1,2,3,4,5};
        add(intArr,10);
        printArray(intArr);
        String[] names ={"홍길동","홍길서","홍길남","홍길북"};
        changeName(names,"김");
        printArray(names);
    }
    private static void add(int intArr[],int a)
    {

        for( int i=0;i<intArr.length;i++){
            intArr[i]+=10;
        }
    }
    private static void printArray(int intArr[])
    {

        for( int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }

    private static void printArray(String intArr[])
    {

        for( int i=0;i<intArr.length;i++){
            System.out.println(intArr[i]);
        }
    }
    private static void changeName(String name[],String familyname)
    {
        for(int i=0;i<name.length;i++)
        {
            name[i]=familyname + name[i].substring(1);
        }
    }
}
