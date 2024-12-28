package section01.object.run;

import section01.object.book.Book;

public class Application1 {
    public static void main(String[] args) {
        /* 모든 클래스는 Object 클래스의 후손이다
        따라서 Object 클래스가 가진 메소드를 자신의 것 처럼 사용 가능
        또한 부모 클래스가 가지는 메소드를 오버라이딩 해서 사용하는 것도 가능 */

        Book book1 = new Book(1, "홍길동전", "허균", 50000);
        Book book2 = new Book(2, "목민심서", "정약용", 30000);
        Book book3 = new Book(2, "목민심서", "정약용", 30000);
        // 주소값이 다른 세 개의 객체(인스턴스) 생성

        System.out.println("book1.toString()" + book1.toString());  // Book@2f4d3709
        System.out.println("book2.toString()" + book2.toString());  // Book@7291c18f
        System.out.println("book3.toString()" + book3.toString());  // Book@34a245ab
        // 동일한 값을 가지는 인스턴스도 다른 해시코드 값을 가지고 있다.
        // 풀 클래스 이름과 @ 그리고 16진수 해시코드를 반환한다.

        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);
        // toString()을 호출하지 않고, 레퍼런스 변수만 출력하는 경우 동일하게 결과가 나온다.
        // 이 경우 자동으로 toString() 메소드를 호출해준다.
        // 이런 편리한 점을 이용해 toString() 메소드를 재정의해서 사용
    }
}
