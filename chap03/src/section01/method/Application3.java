package section01.method;

public class Application3 {
    public static void main(String[] args) {
        /* 전달인자(arguments)와 매개변수(parameter)를 이용한 메소드 호출
        변수의 종류
        1. 지역변수
        2. 매개변수
        3. 전역변수(필드)
        4. 클래스(static)변수
         */

        /* 지역변수는 선언한 메소드 블럭 내부에서만 사용 가능하다. 지역변수의 스코프
        다른 메소드간 서로공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서 값을 전달할 수 있다.
        이 때 전달하는 값을 전달인자라고 부르고
        메소드 선언부 괄호 안에 전달인자를 받기 위해 선언하는 변수를 매개변수라고 부른다.
         */
        Application3 app3 = new Application3();
        /* 전달인자와 매개변수를 이용한 메소드 호출 테스트 */
        app3.testMethod(20);
        // app3.testMethod(정수형을 대입해줘야한다.)
        // app3.testMethod("40"); // 매개변수는 int형 이지만 인지가 String형이기 때문에 에러
        // app3.testMethod(20, 30, 40); // 매개변수는 int형 1개 이지만 인자는 3개이기 때문에 에러
        // app3.testMethod(); // 매개변수는 서넝ㄴ되어 있지만 인자로 값을 전달하지 않으면 에러

        int age2 = 20;
        app3.testMethod(age2);

        byte byteAge = 10;
        app3.testMethod(byteAge);

        long longAge = 30;
        // app3.testMethod(longAge); // 자동 형변환을 할 수 없어 에러
        app3.testMethod((int) longAge); // 강제 형변환을 이용하여 자료형을 맞춘 후 호출(데이터 손실 주의)

        app3.testMethod(age2 * 4);
    }

    public void testMethod(int age) {
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
