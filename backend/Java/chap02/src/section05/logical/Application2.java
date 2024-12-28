package section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /* 논리 연산자의 우선순위
        && : 11순위
        || : 12순위
         */

        int num1 = 55;
        /* 1 <= 변수 <= 100 x
        변수 >= 1 && 변수 <= 100 o
         */
        System.out.println("1부터 100사이인지? : " + ( num1 >= 1 && num1 <= 100)); // true

        int num2 = 175;
        System.out.println("1부터 100사이인지? : " + ( num2 >= 1 && num2 <= 100)); // false

        /* 영어 대문자인지 확인
        문자변수 >= 'A' && 문자변수 <= 'Z'
         */
        char ch = 'T';
        System.out.println("영어가 대문자인지? : " + ( ch >= 'A' && ch <= 'Z')); // true

        char ch2 = 'w';
        System.out.println("영어가 대문자인지? : "+ ( ch2 >= 'A' && ch2 <= 'Z')); //false

        /* 대 소문자 상관 없이 영문자 'y' 인지 확인 */
        char ch3 = 'Y'; // y가 소문자여도 true가 나온다.
        System.out.println("영어가 Y인지? : " + (ch3 == 'Y' || ch3 == 'y')); // true

        /* 영문자인지 확인
        A ~ Z : 65 ~ 90
        a ~ z ; 97 ~ 120
         */
        char ch4 = 'f';
        System.out.println("영문자인지 확인 : " + ( (ch4 >= 'A' && ch4 <= 'Z') || (ch4 >= 'a' && ch4 <= 'z'))); //true
        System.out.println("영문자인지 확인 : " + ( (ch4 >= 65 && ch4 <= 90) || (ch4 >= 97 && ch4 <= 120))); //true
    }
}
