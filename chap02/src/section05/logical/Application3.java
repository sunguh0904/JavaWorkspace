package section05.logical;

public class Application3 {
    public static void main(String[] args){
        /* AND 연산과 OR 연산의 특징
        논리식 && 논리식 : 앞의 결과가 false면 뒤를 실행 안 함
             조건식 두 개가 모두 만족해야 true를 반환하기 때문에 앞의 결과가 false가 나오면 뒤의 조건을 확인 할 필요 없이 false를 반환
             따라서 연산 횟수를 줄이기 위해서는 앞에 false가 나올 가능성이 높은 조건을 작성한다
        논리식 || 논리식 : 앞의 결과가 true면 뒤를 실행 안 함
            조건식 하나만 만족해도 true를 반환하기 때문에 앞의 결과가 true가 나오면 뒤의 조건을 확인할 필요 없이 true를 반환
            연산 횟수를 줄이기 위해서는 앞에 true가 나올 가능성이 높은 조건을 작성한다
         */

        int num1 = 10;
        int result1 = (false && ++num1 > 0)? num1 : num1;
        System.out.println("&&실행 결과 : " + result1);

        int num2 = 10;
        int result2 = (true || ++num2 > 0 )? num2 : num2; // 10
        System.out.println("||실행 결과 : " + result2);

        int num3 = 10;
        int result3 = (++num3 > 0 || true )? num3 : num3; // 11
        System.out.println("||실행 결과 : " + result3);
    }
}
