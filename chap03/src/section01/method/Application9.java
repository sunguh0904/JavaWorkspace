package section01.method;

public class Application9 {
    public static void main(String[] args) {
        /* 다른 클래스에서 작성한 메소드 호출 */

        int first = 100;
        int second = 50;

        /* non-static 메소드의 경우
        클래스가 다르더라도 사용하는 방법은 동일
        클래스명 사용할이름 = new 클래스명();
        사용할이름.메소드명();
         */

        Calculator calc = new Calculator();
        int min = calc.minNumberOf(first, second);
        System.out.println("두 수 중 최소 값은 : " + min);

        /* static 메소드인 경우
        다른 클래스에 작성한 static 메소드의 경우 호출할 때 클래스명을 반드시 기술
        클래스명.메소드명();
         */

        // int max = maxNumberOf(first, second);
        int max = Calculator.maxNumberOf(first, second);
        System.out.println("두 수 중 최대 값은 : " + max);

        int max2 = calc.maxNumberOf(first, second);
        System.out.println("두 수 중 더 큰 값은 : " + max2);
        // static 메소드는 static에 접근하는 방법을 사용하라고 경고 메세지가 뜬다.
        // 하지만 정상적으로 실행은 가능하다.
    }
}
