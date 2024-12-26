package section03.math;

public class Application1 {
    public static void main(String[] args) {
        /* API란?
        Application Program Interface 는 응용프로그램에서 사용할 수 있도록,
        운영체제나 프로그래밍 언어가 제공하는 기능을 제어할 수 있도록 만든 인터페이스
        JDK를 설치하면 사용할 수 있도록 제공해놓은 소스코드를 의미
         */

        /* java.lang.Math 클래스
        Math 클래스는 수학에서 자주 사용하는 상수들과 함수들을 미리 구현해놓은 클래스
        모든 메소드는 static 메소드로 작성되어 있다.
         */

        System.out.println("-5의 절대값 : " + (Math.abs(-5)));
        // abs 메소드 매개변수에 -5를 대입했다.

        /* Math 클래스는 import 를 하지 않아도 쓸 수 있다.
        ( 다른 클래스에 있기 때문에 가져와야 하지만 java.lang에 속해 있으면 import 가 필요없다.)
        Java.lang 패키지에 속한 클래스이기 때문이다.
        워낙 자주 사용하는 패키지이다 보니 import 를 하지 않고 사용할 수 있도록 해놓았다.
         */
        System.out.println("-1.5의 절대 값: " + Math.abs(-1.5));
        System.out.println("10과 20중 더 작은 것? : " + Math.min(10, 20));
        System.out.println("10과 20중 더 큰 것? : " + Math.max(10, 20));

        System.out.println("원주율 : " + Math.PI);

        /* 난수 출력
        0 부터 1 전까지의 실수 형태의 난수를 발생시킨다.*/
        System.out.println("난수 발생 : " + Math.random());
    }
}
