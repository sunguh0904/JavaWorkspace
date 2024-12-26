package section06.tenary;

public class Application1 {
    public static void main(String[] args) {
        /* 삼항 연산자
        자바에서 유일하게 피연산자 항목이 3개인 연산자이다
        (조건식)? 참일 때 사용할 값 : 거짓일 때 사용할 값
         */

        /* 삼항 연산자 단독 사용 */
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0 )? "양수" : "양수 아니다";
        // num1은 0보다 큰가? true 이기 때문에 "양수"가 출력
        String result2 = (num2 > 0)? "양수" : "양수 아니다";
        // num2는 0보다 큰가? false 이기 때문에 "양수 아니다"가 출력
        System.out.println("num1은 : " + result1);
        System.out.println("num2는 : " + result2);

        /* 삼항 연산자 중첩 사용 */
        int num3 = 5;
        int num4 = 0;
        int num5 = -5;
        String result3 = (num3 > 0)? "양수" : (num3 == 0)? "0이다" : "음수";
        // num3이 0보다 큰가? true 이기 때문에 값은 "양수"
        System.out.println("num3은 : " + result3);

        String result4 = (num4 > 0)? "양수" : (num4 == 0)? "0" : "음수";
        System.out.println("num4는 : " + result4);

        String result5 = (num5 > 0)? "양수" : (num5 == 0)? "0" : "음수";
        System.out.println("num5는 : " + result5);
    }
}
