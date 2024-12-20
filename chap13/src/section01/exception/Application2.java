package section01.exception;

public class Application2 {
    public static void main(String[] args) {
        /* try-catch 블록을 이용한 예외처리 방법 */

        ExceptionTest exceptionTest = new ExceptionTest();

        try {
            exceptionTest.checkEnoughMoney(10000, 5000);
            System.out.println("===============상품 구입 가능===============");
        }catch (Exception exception) {
            System.out.println("===============상품 구입 불가===============");
        }
        System.out.println("프로그램을 종료 합니다.");
    }
}
