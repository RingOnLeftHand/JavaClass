package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        //기본형
        //int double char(default = " ") long short float boolean byte(default = false)
        //참조형
        //String Book Car Random Scanner StringBuilder ...
        int[] intArr = new int[5];
        printArray(intArr);

        double[] doubleArr = new double[5];
        printArray(doubleArr);

        int[] intArr2 = /*new int[5]*/{3, 1, 3, 3, 7};
        printArray(intArr2);

        String[] strArr = new String[3];
        printArray(strArr);



       /* Book[] bookArr = new Book[2];
        bookArr[0] = new Book("asdf","asdf",123);
        bookArr[1] = new Book("qwer","qwer",456);

        printArray(bookArr);*/

        Book[] bookArr2 = {new Book("asdf","asdf",123),new Book("qwer","qwer",456)};
        printArray(bookArr2);
    }

    private static void printArray(Book[] bookArr) {
        for(Book value : bookArr){
            System.out.println(value);
        }
    }


    private static void printArray(int[] intArr) {
        for(int value : intArr)
            System.out.print(value + " ");
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        for(String value : strArr)
            System.out.print(value + " ");
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for(double value : doubleArr)
            System.out.print(value + " ");
        System.out.println();
    }



}