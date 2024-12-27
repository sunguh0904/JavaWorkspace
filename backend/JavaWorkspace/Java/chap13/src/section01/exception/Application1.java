package section01.exception;

public class Application1 {
    public static void main(String[] args) throws Exception {
        /* [ 예외를 발생시키는 구문 ]
        throw new 예외클래스명();

        [ 예외 처리 방법 ]
        1. throws로 위임
        2. try-catch로 처리 */

        ExceptionTest exceptionTest = new ExceptionTest();

        exceptionTest.checkEnoughMoney(10000, 50000);
        // 예외 처리 메소드를 호출하는 메소드에도 throws Exception을 적어줘야 에러가 안 뜬다.

        exceptionTest.checkEnoughMoney(50000, 10000);
        // 예외를 일으키는 구문
        // 예외가 발생하면 그 다음 구문은 실행을 하지 않는다. (출력문 실행 안 됨)
     }
}
