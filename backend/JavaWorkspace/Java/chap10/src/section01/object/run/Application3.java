package section01.object.run;

import section01.object.book.Book;

public class Application3 {
    public static void main(String[] args) {
         /* [ hashCode() 메소드 오버라이딩 ]
         Object 클래스의 명세에 작성된 일반 규약에 따르면
         equals() 메소드를 재정의 하는 경우 반드시 hashCode() 메소드도 재정의 하도록 명시
         만약 hashCode()를 재정의 하지 않으면 같은 값을 가지는 동등객체는
         같은 해시코드값을 가져야 한다는 규칙에 위반,( 강제성은 없지만 규약대로 작성하는 것이 좋다 ) */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("book1 의 hashCode() : " + book1.hashCode());
        System.out.println("book2 의 hashCode() : " + book2.hashCode());
        System.out.println("book1 equals book2 : " + book1.equals(book2));
    }
}
