package section03.constant;

public class Application2 {
    public static void main(String[] args) {
        /* 상수의 명명 규칙
        상수의 명명 규칙은 변수의 명명 규칙과 컴파일 에러를 발생시키는 규칙은 동일하다.
        단, 개발자들끼리의 암묵적인 규칙에서 일부 차이를 보인다.
        1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다.
        2. 단어와 단어 연결은 언더스코어(_)를 사용한다.
         */

        // 소문자로 사용은 가능하지만 변수와 구분하기 힘들기 때문에 만들어진 규칙. 상수는 대문자 사용
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 40;

        // camelCase 기법으로 사용이 가능하지만 변수와 구분되지 않는다.
        final int MAX_AGE = 60;
        final int MIN_AGE = 20;
        final int minAGE = 30;
    }
}
