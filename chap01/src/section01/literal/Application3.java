package section01.literal;

public class Application3 {
    public static void main(String[] args) {
        System.out.println("두 개의 문자열 합치기");
        System.out.println(9 + 9);
        System.out.println("9" + 9);
        System.out.println(9 + "9");
        System.out.println("9" + "9");
        // 문자열이 연산에 들어가면 출력 값은 문자열로 나옴
        System.out.println("================");

        System.out.println("세개의 문자열 합치기");
        System.out.println(9 + 9 + "9"); // 189
        System.out.println(9 + "9" + 9); // 999
        System.out.println("9" + 9 + 9); // 999
        System.out.println("9" + (9 + 9)); // 918
        // 괄호를 사용하면 괄호부터 연산
        System.out.println("================");

        System.out.println("10과 20의 사칙연산 결과");
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(10 / 20);
        System.out.println(10 % 20);
        System.out.println("================");

        System.out.println("10과 20의 사칙연산 결과 보기 좋게 출력");
        System.out.println("10과 20의 합 :" + (10 + 20));
        // System.out.println("10과 20의 합 :" + 10 + 20);
        System.out.println("10과 20의 차 :" + (10 - 20));
        // System.out.println("10과 20의 차 :" + 10 - 20);
        System.out.println("10과 20의 곱 :" + (10 * 20));
        System.out.println("10과 20의 나누기 몫 :" + (10 / 20));
        System.out.println("10과 20의 나누기 나머지 :" + (10 % 20));
        System.out.println("================");

        System.out.println("기차");
        System.out.println("기차" + "칙칙폭폭");
        System.out.println("기차" + 123 + 45 + "출발");
        System.out.println(123 + 45 + "기차" + "출발");
        System.out.println("================");
    }
}
