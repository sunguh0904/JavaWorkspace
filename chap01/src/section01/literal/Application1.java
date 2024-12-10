package section01.literal;

public class Application1 {
    public static void main(String[] args) {
        // 정수
        System.out.println(123);

        // 실수
        System.out.println(1.23);

        // 문자 형태의 값은 싱글쿼테이션으로 감싸야함
        System.out.println('A');

        // 두 개 이상은 문자로 취급하지 않기 때문에 에러
        // System.out.println('AB');

        // 숫자 값 이지만 싱글쿼테이션으로 감싸져 있는 경우 문자 1 취급
        System.out.println('1');

        // 문자열은 문자 여러 개가 나열된 형태를 말하며 더블쿼테이션으로 감싸야함
        System.out.println("안녕하세요");

        // 정수 이지만 더블쿼테이션으로 감싸져있기 때문에 문자열 취급
        System.out.println("123");

        // 아무 값도 없는 빈 더블쿼테이션도 문자열로 취급
        System.out.println("");

        // 한 개의 문자도 더블쿼테이션으로 감싸면 문자열 취급
        System.out.println("C");

        // ture 또는 false 값을 논리형이라함
        System.out.println(true);
        System.out.println(false);
    }
}
