package section01.conditional;

import java.util.Scanner;

public class A_if {
    public void simpleIfStatement() {

        /* [if문 표현식]
        if(조건식) {
            조건식이 true 일 때 실행할 명령문
        }
         */

        Scanner sc = new Scanner(System.in);
        // 스캐너를 호출, 알트 엔터를 눌러 임포트 활성화
        System.out.print("숫자 한 개를 입력하세요 : ");
        int num = sc.nextInt();
        // 스캐너 객체 생성

        if(num % 2 == 0) {
            // num 을 2로 나누어서 0이랑 같다면(ture)
            System.out.println("입력하신 숫자는 짝수 입니다.");
            // 출력
        }
        System.out.println("프로그램을 종료 합니다.");
        // 출력 후 종료
    }

    public void nestedIfStatement() {
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        System.out.print("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();
        // 스캐너에 정수형을 담고 num 변수명에 담는다.

        if(num > 0) {
            // num 은 0보다 큰가? 양수인가? 참이면 아래 두 개의 if 문을 계산해서 맞는 쪽으로 출력
            // false 면 마지막 "끝" 출력
            if (num % 2 == 0){
                // num 을 2로 나눴을 때 0이랑 같으면 출력
                System.out.println("양수이면서 짝수 입니다.");
            }
            if(num % 2 != 0) {
                // num 을 2로 나눴을 때 0이랑 다르면 출력
                System.out.println("양수이면서 홀수 입니다.");
            }
        }
        System.out.println("끝");
    }
}
