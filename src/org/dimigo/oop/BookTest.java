package org.dimigo.oop;

public class BookTest {
    public static void main(String[] args) {
        Book book;// 레퍼런스 변수 선언
        book = new Book();//객체 생성 후 변수에 할당
        Book book2 = new Book();
        System.out.println(book);
        System.out.println(book2);

        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPage());
        book.setTitle("수학의정석");
        book.setAuthor("홍성대");
        book.setPage(350);

        Book book3 = new Book("Word Master","전유원",100);
        System.out.println(book3.getTitle());
    }
}
