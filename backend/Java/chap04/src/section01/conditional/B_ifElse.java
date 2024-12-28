package section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void simpleIfElseStatement() {

    /*
    if-else 문 표현식
    if(조건식) {
            조건식이 true 일 때 실행할 명령문
    } else {
            조건식이 false 일 때 실행할 명령문
    }
     */

        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        // 스캐너의 정수 값을 num 변수에 저장한다.

        if(num % 2 == 0) {
            // true 일 때 짝수 출력
            System.out.println("입력하신 숫자는 짝수 입니다.");
        } else {
            // false 일 때 홀수 출력
            System.out.println("입력하신 숫자는 홀수 입니다.");
        }
        System.out.println("끝");

    }

    public void nestedIfElseStatement() {
        Scanner sc = new Scanner(System.in);
        // 스캐너 객체 생성
        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();
        // 스캐너의 정수 값을 num 변수에 저장한다.

        if(num != 0) {
            // num 은 0이랑 같지않나?
            // 같지 않나가 나올 경우 true, 다음 if 문을 실행
            // 같다(true)가 나오면 마지막 else 문을 실행 "0" 출력
            if (num > 0) {
                // num 은 0보다 큰가? 크면 "양수" 출력
                // 그렇지 않다면 else 문 실행
                System.out.println("양수 입니다.");
            } else {
                System.out.println("음수 입니다.");
            }
        } else {
            System.out.println("0 입니다.");
        }
        System.out.println("프로그램을 종료 합니다.");
    }
}
