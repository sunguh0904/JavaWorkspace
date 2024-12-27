package section01.object.run;

import section01.object.book.Book;

public class Application2 {
    public static void main(String[] args) {
        /* [ equals() 메소드 오버라이딩 ]
        equals 메소드는 매개변수로 전달받은 인스턴스와 == 연산하여 ture or false 를 반환
        즉 동일한 인스턴스인지를 비교하는 기능

        동일객체 : 주솟값이 동일한 인스턴스
        동등객체 : 주소는 다르더라도 필드값이 동일한 객체 */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(1, "홍길동전", "허균", 50000);

        System.out.println("두 인스턴스의 == 연산 비교 : " + (book1 == book2));
        System.out.println("두 인스턴스의 equals() 비교 : " + (book1.equals(book2)));
    }
}
