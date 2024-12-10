package section01.literal;

public class Application2 {
    public static void main(String[] args) {
        // 한 줄 주석
        /* 여러 줄 주석 */

        System.out.println("정수와 정수의 연산");
        System.out.println(123 + 456);
        System.out.println(123 - 45);
        System.out.println(123 * 456);
        System.out.println(123 / 10);
        System.out.println(123 % 10);
        System.out.println("================");

        System.out.println("실수와 실수의 연산");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23 - 0.23);
        System.out.println(1.23 * 10.0);
        System.out.println(1.23 / 10.0);
        System.out.println(1.23 % 1.0);
        System.out.println("================");

        System.out.println("정수와 실수의 연산");
        System.out.println(123 + 0.5);
        System.out.println(123 - 0.5);
        System.out.println(123 * 0.5);
        System.out.println(123 / 0.5);
        System.out.println(123 % 0.5);
        System.out.println("================");

        System.out.println("문자와 문자의 연산");
        System.out.println('a' + 'b');
        System.out.println('a' - 'b');
        System.out.println('a' * 'b');
        System.out.println('a' / 'b');
        System.out.println('a' % 'b');
        System.out.println("================");

        System.out.println("문자와 정수의 연산");
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);
        System.out.println("================");

        System.out.println("문자와 실수의 연산");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        System.out.println("================");

        System.out.println("문자열과 문자열의 연산");
        System.out.println("hello" + "world");
        // System.out.println("hello" - "world");
        // System.out.println("hello" * "world");
        // System.out.println("hello" / "world");
        // System.out.println("hello" % "world");
        // 문자열과 문자열은 더하기 연산자만 사용할 수 있다
        System.out.println("================");

        System.out.println("문자열과 다른 형태의 값 연산");
        System.out.println("helloWorld" + 123);
        System.out.println("helloWorld" + 123.456);
        System.out.println("helloWorld" + 'A');
        System.out.println("helloWorld" + true);
        // 문자열 + 정수, 실수, 문자, 논리가 들어가게 된다면 모두 문자열로 취급
        System.out.println("================");

        System.out.println("문자열 형태의 숫자 값 '+' 연산");
        System.out.println("123" + "123");
        // System.out.println(true + false);
        // System.out.println(true - false);
        // System.out.println(true * false);
        // System.out.println(true / false);
        // System.out.println(true % false);
        // 논리 값 끼리의 연산은 모든 연산자 사용 불가능
        System.out.println("================");

        // System.out.println(true + 1);
        // System.out.println(true - 1);
        // System.out.println(true * 2);
        // System.out.println(true / 2);
        // System.out.println(true % 2);
        // 논리 값 과 정수의 연산은 모든 연산자 사용 불가능
        System.out.println("================");

        // System.out.println(true + 1.0);
        // System.out.println(true - 1.0);
        // System.out.println(true * 2.0);
        // System.out.println(true / 2.0);
        // System.out.println(true % 2.0);
        // 논리 값 과 실수의 연산은 모든 연산자 사용 불가능
        System.out.println("================");

        // System.out.println(true + 'A');
        // System.out.println(true - 'A');
        // System.out.println(true * 'A');
        // System.out.println(true / 'A');
        // System.out.println(true % 'A');
        // 논리 값 과 문자의 연산은 모든 연산자 사용 불가능, 아스키, 유니코드
        System.out.println("================");

        System.out.println("논리와 문자열의 연산");
        System.out.println(true + "Hello");
        // System.out.println(true - "Hello");
        // System.out.println(true * "Hello");
        // System.out.println(true / "Hello");
        // System.out.println(true % "Hello");
        // 논리 값 과 문자열의 연산은 더하기 연산자만 사용가능
        System.out.println("================");
    }
}
