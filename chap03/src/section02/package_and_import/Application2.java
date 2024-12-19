package section02.package_and_import;

import section01.method.Calculator;

import static section01.method.Calculator.maxNumberOf;

public class Application2 {
    public static void main(String[] args) {
        /* 임포트란?
        서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야 한다.
        하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
        그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 구문이다.

        서로 다른 패키지에 존재하는 클래스를 사용하는 경우
        매번 풀 클래스 네임을 기술하기가 번거롭다.
        그래서 어떠한 패키지 내에 있는 클래스를 사용할 것인지에 대해
        미리 선언하는 임포트문을 사용하면 풀 클래스네임을 매번 작성하지 않아도 된다.
         */

        /* non-static 메소드 */
        Calculator calc = new Calculator();
        int min = calc.minNumberOf(50, 60);
        System.out.println("50과 60중 더 작은 값은 : " + min);

        /* static 메소드 */
        int max = maxNumberOf(50, 60);
        System.out.println("50과 60중 더 큰 값은 : " + max);

        int max2 = maxNumberOf(100, 200);
        System.out.println("큰 수 : " + max2);
    }
}
